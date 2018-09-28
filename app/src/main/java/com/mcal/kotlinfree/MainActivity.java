/*
 * Copyright (C) 2018 Тимашков Иван
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mcal.kotlinfree;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

import com.mcal.kotlinfree.app.MainSettingsActivity;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.mcal.kotlinfree.utils.UtilsSettings;
import com.mcal.kotlinfree.SdkActivity;
import com.google.android.gms.ads.AdListener;
import android.util.Log;

//##################################################################
/**
 * @since 25.09.2018
 * @author Тимашков Иван
 * @author https://github.com/TimScriptov
 */
public class MainActivity extends AppCompatActivity
//##################################################################
	{
		public static SdkActivity mPESdk;

		AdView mAdView;
//===================================================================
		@Override
		protected void onCreate ( Bundle savedInstanceState )
//===================================================================
			{
				super.onCreate ( savedInstanceState );
				setContentView ( R.layout.main );

				mPESdk = new SdkActivity ( new UtilsSettings ( this ) );

				MobileAds.initialize ( this, "ca-app-pub-1411495427741055~6707896587" );

				mAdView = (AdView) findViewById(R.id.adView);
				AdRequest adRequest = new AdRequest.Builder().build();
				mAdView.loadAd(adRequest);
				mAdView.setAdListener ( new AdListener ( ) {
							@Override
							public void onAdLoaded ( )
								{
									// Code to be executed when an ad finishes loading.
									Log.i ( "Ads", "banner onAdLoaded" );
								}

							@Override
							public void onAdFailedToLoad ( int errorCode )
								{
									// Code to be executed when an ad request fails.
									Log.i ( "Ads", "banner onAdFailedToLoad" );
								}

							@Override
							public void onAdOpened ( )
								{
									// Code to be executed when an ad opens an overlay that covers the screen.
									Log.i ( "Ads", "banner onAdOpened" );
								}

							@Override
							public void onAdLeftApplication ( )
								{
									// Code to be executed when the user has left the app.
									Log.i ( "Ads", "banner onAdLeftApplication" );
								}

							@Override
							public void onAdClosed ( )
								{
									// Code to be executed when when the user is about to return to the app after tapping on an ad.
									Log.i ( "Ads", "banner onAdClosed" );
								}
						} );

				Toolbar toolbar = (Toolbar) findViewById ( R.id.toolbar );
				setSupportActionBar ( toolbar );

				Button btn1 = (Button) findViewById ( R.id.btnLessons );
				Button btn2 = (Button) findViewById ( R.id.btnPreferences );
				Button btn3 = (Button) findViewById ( R.id.btnChangelog );
				btn1.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int1= new Intent ( MainActivity.this, LessonsActivity.class );
									startActivity ( int1 );
								}
						} );
				btn2.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int2 = new Intent ( MainActivity.this, MainSettingsActivity.class );
									startActivity ( int2 );
								}
						} );
				btn3.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int3 = new Intent ( MainActivity.this, com.mcal.kotlinfree.app.ChangelogActivity.class );
									startActivity ( int3 );
								}
						} );
			}//onCreate
//===================================================================
	}//MainActivity
//##################################################################
