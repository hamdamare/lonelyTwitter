package ca.ualberta.cs.lonelytwitter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;



public class LonelyTwitterActivity extends Activity {

	private static final String FILENAME = "file.sav";
	private EditText bodyText;
	private ListView oldTweetsList;

	/**
	 * Called when the activity is first created.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		bodyText = (EditText) findViewById(R.id.body);
		Button saveButton = (Button) findViewById(R.id.save);
		oldTweetsList = (ListView) findViewById(R.id.oldTweetsList);

		saveButton.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				setResult(RESULT_OK);
				String text = bodyText.getText().toString();



				Tweet newtweet = new Tweet(text);
				Tweet newtweet2 = new Tweet(text, new Date);
				ImportantTweet imptweet = new ImportantTweet("This is a important message");
                NormalTweet ntweet = new NormalTweet("This is a normal tweet");

				ArrayList<Tweet> alltweets = new ArrayList<Tweet>();
				alltweets.add(newtweet);
				alltweets.add(imptweet);
				alltweets.add(newtweet);
				alltweets.add(newtweet2);
				alltweets.add(imptweet);
				alltweets.add(ntweet);


				alltweets[0].isimportant();




				try{
					newtweet.setMessage("this message is too long");
				} catch (ThrowNewException e) {
                    e.printStackTrace();
                }
                saveInFile(text, new Date(System.currentTimeMillis()));
				finish();



		}
		});
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		String[] tweets = loadFromFile();
		//putting all files to be saved in a list view
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				R.layout.list_item, tweets);
		oldTweetsList.setAdapter(adapter);
	}


	//use this in your assignment 1 ssee where the error u have comes from
	private String[] loadFromFile() {
		ArrayList<String> tweets = new ArrayList<String>();
		try {
			//opening the input file
			FileInputStream fis = openFileInput(FILENAME);
			//reading the inputfile
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));
			String line = in.readLine();
			while (line != null) {
				tweets.add(line);
				line = in.readLine();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//putting the file into our listview
		return tweets.toArray(new String[tweets.size()]);
	}

	private void saveInFile(String text, Date date) {
		try {
			FileOutputStream fos = openFileOutput(FILENAME,
					Context.MODE_APPEND);
			fos.write(new String(date.toString() + " | " + text)
					.getBytes());
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}