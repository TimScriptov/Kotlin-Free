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
public class Lessons2 extends AppCompatActivity
//##################################################################
	{
		AdView mAdView;
//===================================================================
		@Override
		protected void onCreate ( Bundle savedInstanceState )
//===================================================================
			{
				super.onCreate ( savedInstanceState );
				setContentView ( R.layout.lessons2 );

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
				
				Button btn14=(Button) findViewById ( R.id.btnLesson14 );
				Button btn15=(Button) findViewById ( R.id.btnLesson15 );
				Button btn16=(Button) findViewById ( R.id.btnLesson16 );
				Button btn17=(Button) findViewById ( R.id.btnLesson17 );
				Button btn18=(Button) findViewById ( R.id.btnLesson18 );
				Button btn19=(Button) findViewById ( R.id.btnLesson19 );
				Button btn20=(Button) findViewById ( R.id.btnLesson20 );
				Button btn21=(Button) findViewById ( R.id.btnLesson21 );
				Button btn22=(Button) findViewById ( R.id.btnLesson22 );
				Button btn23=(Button) findViewById ( R.id.btnLesson23 );
				Button btn24=(Button) findViewById ( R.id.btnLesson24 );
				Button btn25=(Button) findViewById ( R.id.btnLesson25 );
				btn14.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int14= new Intent ( Lessons2.this, com.mcal.kotlinfree.lessons.Lesson14.class );
									startActivity ( int14 );
								}
						} );
				btn15.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int15= new Intent ( Lessons2.this, com.mcal.kotlinfree.lessons.Lesson15.class );
									startActivity ( int15 );
								}
						} );
				btn16.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int16= new Intent ( Lessons2.this, com.mcal.kotlinfree.lessons.Lesson16.class );
									startActivity ( int16 );
								}
						} );
				btn17.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int17= new Intent ( Lessons2.this, com.mcal.kotlinfree.lessons.Lesson17.class );
									startActivity ( int17 );
								}
						} );
				btn18.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int18= new Intent ( Lessons2.this, com.mcal.kotlinfree.lessons.Lesson18.class );
									startActivity ( int18 );
								}
						} );
				btn19.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int19= new Intent ( Lessons2.this, com.mcal.kotlinfree.lessons.Lesson19.class );
									startActivity ( int19 );
								}
						} );
				btn20.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int20= new Intent ( Lessons2.this, com.mcal.kotlinfree.lessons.Lesson20.class );
									startActivity ( int20 );
								}
						} );
				btn21.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int21= new Intent ( Lessons2.this, com.mcal.kotlinfree.lessons.Lesson21.class );
									startActivity ( int21 );
								}
						} );


				btn22.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int22= new Intent ( Lessons2.this, com.mcal.kotlinfree.lessons.Lesson22.class );
									startActivity ( int22 );
								}
						} );
				btn23.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int23= new Intent ( Lessons2.this, com.mcal.kotlinfree.lessons.Lesson23.class );
									startActivity ( int23 );
								}
						} );
				btn24.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int24= new Intent ( Lessons2.this, com.mcal.kotlinfree.lessons.Lesson24.class );
									startActivity ( int24 );
								}
						} );
				btn25.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int25= new Intent ( Lessons2.this, com.mcal.kotlinfree.lessons.Lesson25.class );
									startActivity ( int25 );
								}
						} );
			}//onCreate
//===================================================================
	}//Lessons2
//##################################################################
