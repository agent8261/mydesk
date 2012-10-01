package com.mydesk;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import com.appspot.api.services.mydeskbackend.Mydeskbackend;
import com.appspot.api.services.mydeskbackend.Mydeskbackend.Builder;
import com.appspot.api.services.mydeskbackend.model.Lexicon;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.json.jackson.JacksonFactory;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

//import org.codehaus.jackson.JsonParser;

public class MainActivity extends Activity 
{
	private String viewText = "You Have to click the button";
	private String localurl;
	
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
				// Build Endpoint
				Builder endpointBuilder = new Mydeskbackend.Builder(
							AndroidHttp.newCompatibleTransport(),
							new JacksonFactory(),
							new ReqIntializer());
					  
				Mydeskbackend endpoint = 
						 CloudEndpointUtils.updateBuilder(endpointBuilder).build();
				// Call getLexicoin
				Lexicon result = endpoint.getLexicon("hello").execute();
				// Return result of function call
				return result.toString();
			}
			catch (IOException e) 
			{  System.out.println(e.getMessage());  }		
			return null;
		}
		public void onPostExecute(String result)
		{
			setTextView(result);
		}
	}

}
