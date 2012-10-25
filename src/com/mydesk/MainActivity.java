package com.mydesk;

import java.io.IOException;

import com.appspot.api.services.genericendpt.Genericendpt;
import com.appspot.api.services.genericendpt.model.GenericBuffer;
import com.appspot.api.services.genericendpt.Genericendpt.Builder;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.json.jackson.JacksonFactory;
import com.google.protobuf.InvalidProtocolBufferException;
import com.mydesk.ProtocolBufferTransport.DummyMessage;
import com.mydesk.ProtocolBufferTransport.GenericTransport;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.util.Base64;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity 
{
	private String viewText = "You Have to click the button";
	
	@Override
  public boolean onCreateOptionsMenu(Menu menu) 
  {
	  getMenuInflater().inflate(R.menu.activity_main, menu);
	  return true;
  }
    
  /** Called when the activity is first created. */    
  @Override
  public void onCreate(Bundle savedInstanceState) 
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);      
    //Creating Button variable
    Button button = (Button) findViewById(R.id.bt);           
    //Adding Listener to button
    button.setOnClickListener(new buttonClickHandler());

  }
  //=========================================================================    
  public void getPirate(View view)
  {
  	new GetRequest().execute(null, null, null);
	}
  
  //=========================================================================
  public void setTextView(String result)
  {
  	viewText = result;
    //Creating TextView Variable
    TextView text = (TextView) findViewById(R.id.tv);              
    //Sets the new text to TextView (runtime click event)
    text.setText(viewText);   
  }
  //=========================================================================
  public class buttonClickHandler implements OnClickListener
  {
		@Override
		public void onClick(View v)
		{  getPirate(v);  }
  }
  //=========================================================================
  public class ReqIntializer implements HttpRequestInitializer
  {
		@Override
		public void initialize(HttpRequest arg0) throws IOException
		{}  	
  }
//=========================================================================
	private class GetRequest extends AsyncTask<Void, Void, String> 
	{
		@Override
		protected String doInBackground(Void... arg0)
		{
			try 
			{
				// Build End-point
				Builder endpointBuilder = new Genericendpt.Builder(
							AndroidHttp.newCompatibleTransport(),
							new JacksonFactory(),
							new ReqIntializer());
					  
				Genericendpt endpoint = 
						 CloudEndpointUtils.updateBuilder(endpointBuilder).build();
				
				// Execute the end-point function
				GenericBuffer result = endpoint.getTest().execute();
				System.out.println(result.toString());
				System.out.println(result.getKey());
				System.out.println(result.getMsg());
				/*				
        URL-safe mode: Default off.
        Line length: Default 76.
        Line separator: Default is CRLF ("\r\n")
				 */
				// Construct string decoder
				byte[] data = Base64.decode(result.getMsg(), Base64.URL_SAFE);
				assert(data != null);
				GenericTransport dataTransport = GenericTransport.parseFrom(data);			
											
				StringBuilder resultText = new StringBuilder(); 
		    DummyMessage dummy;
		    if(dataTransport.hasByteData()
		        && dataTransport.getTypeName().equals("DummyMessage"))
		    {
		      try
		      {
		        dummy = DummyMessage.parseFrom(dataTransport.getByteData());
		        resultText.append("Encoded Data:\n");
		        resultText.append(result.getMsg());
		        resultText.append(" \n\nData Msg: ");
		        resultText.append(dummy.getMsg());
		      }
		      catch( InvalidProtocolBufferException e )
		      { resultText.append("Error parsing Message"); }
		    }
								
				return resultText.toString();
			}
			catch (IOException e) 
			{  System.out.println(e.getMessage());  }	
			catch(NullPointerException n)
			{ }
			
			return new String("Error in transmit");
		}
		public void onPostExecute(String result)
		{
			setTextView(result);
		}
	}

}
