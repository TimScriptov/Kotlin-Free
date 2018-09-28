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
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import android.util.Log;
import com.google.android.gms.ads.AdListener;

//##################################################################
/**
 * @since 25.09.2018
 * @author Тимашков Иван
 * @author https://github.com/TimScriptov
 */
public class Lessons4 extends AppCompatActivity
//##################################################################
	{
		AdView mAdView;
//===================================================================
		@Override
		protected void onCreate ( Bundle savedInstanceState )
//===================================================================
			{
				super.onCreate ( savedInstanceState );
				setContentView ( R.layout.lessons4 );

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
				
				Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
				setSupportActionBar(toolbar);
				
				Button btn31=(Button) findViewById ( R.id.btnLesson31 );
				Button btn32=(Button) findViewById ( R.id.btnLesson32 );
				Button btn33=(Button) findViewById ( R.id.btnLesson33 );
				Button btn34=(Button) findViewById ( R.id.btnLesson34 );
				Button btn35=(Button) findViewById ( R.id.btnLesson35 );
				Button btn36=(Button) findViewById ( R.id.btnLesson36 );
				btn31.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int31= new Intent ( Lessons4.this, com.mcal.kotlinfree.lessons.Lesson31.class );
									startActivity ( int31 );
								}
						} );
				btn32.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int32= new Intent ( Lessons4.this, com.mcal.kotlinfree.lessons.Lesson32.class );
									startActivity ( int32 );
								}
						} );
				btn33.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int33= new Intent ( Lessons4.this, com.mcal.kotlinfree.lessons.Lesson33.class );
									startActivity ( int33 );
								}
						} );
				btn34.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int34= new Intent ( Lessons4.this, com.mcal.kotlinfree.lessons.Lesson34.class );
									startActivity ( int34 );
								}
						} );
				btn35.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int35= new Intent ( Lessons4.this, com.mcal.kotlinfree.lessons.Lesson35.class );
									startActivity ( int35 );
								}
						} );
				btn36.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int36= new Intent ( Lessons4.this, com.mcal.kotlinfree.lessons.Lesson36.class );
									startActivity ( int36 );
								}
						} );

			}//onCreate
//===================================================================
	}//Lessons4
//##################################################################
