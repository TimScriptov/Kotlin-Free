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
public class Lessons1 extends AppCompatActivity
//##################################################################
	{
		AdView mAdView;
//===================================================================
		@Override
		protected void onCreate ( Bundle savedInstanceState )
//===================================================================
			{
				super.onCreate ( savedInstanceState );
				setContentView ( R.layout.lessons1 );

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
				
				Button btn1=(Button) findViewById ( R.id.btnLesson1 );
				Button btn2=(Button) findViewById ( R.id.btnLesson2 );
				Button btn3=(Button) findViewById ( R.id.btnLesson3 );
				Button btn4=(Button) findViewById ( R.id.btnLesson4 );
				Button btn5=(Button) findViewById ( R.id.btnLesson5 );
				Button btn6=(Button) findViewById ( R.id.btnLesson6 );
				Button btn7=(Button) findViewById ( R.id.btnLesson7 );
				Button btn8=(Button) findViewById ( R.id.btnLesson8 );
				Button btn9=(Button) findViewById ( R.id.btnLesson9 );
				Button btn10=(Button) findViewById ( R.id.btnLesson10 );
				Button btn11=(Button) findViewById ( R.id.btnLesson11 );
				Button btn12= (Button) findViewById ( R.id.btnLesson12 );
				Button btn13=(Button) findViewById ( R.id.btnLesson13 );
				btn1.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int1= new Intent ( Lessons1.this, com.mcal.kotlinfree.lessons.Lesson1.class );
									startActivity ( int1 );
								}
						} );
				btn2.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int2= new Intent ( Lessons1.this, com.mcal.kotlinfree.lessons.Lesson2.class );
									startActivity ( int2 );
								}
						} );
				btn3.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int3= new Intent ( Lessons1.this, com.mcal.kotlinfree.lessons.Lesson3.class );
									startActivity ( int3 );
								}
						} );
				btn4.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int4= new Intent ( Lessons1.this, com.mcal.kotlinfree.lessons.Lesson4.class );
									startActivity ( int4 );
								}
						} );
				btn5.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int5= new Intent ( Lessons1.this, com.mcal.kotlinfree.lessons.Lesson5.class );
									startActivity ( int5 );
								}
						} );
				btn6.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int6= new Intent ( Lessons1.this, com.mcal.kotlinfree.lessons.Lesson6.class );
									startActivity ( int6 );
								}
						} );
				btn7.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int7= new Intent ( Lessons1.this, com.mcal.kotlinfree.lessons.Lesson7.class );
									startActivity ( int7 );
								}
						} );
				btn8.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int8= new Intent ( Lessons1.this, com.mcal.kotlinfree.lessons.Lesson8.class );
									startActivity ( int8 );
								}
						} );
				btn9.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int9= new Intent ( Lessons1.this, com.mcal.kotlinfree.lessons.Lesson9.class );
									startActivity ( int9 );
								}
						} );
				btn10.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int10= new Intent ( Lessons1.this, com.mcal.kotlinfree.lessons.Lesson10.class );
									startActivity ( int10 );
								}
						} );
				btn11.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int11= new Intent ( Lessons1.this, com.mcal.kotlinfree.lessons.Lesson11.class );
									startActivity ( int11 );
								}
						} );
				btn12.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int12= new Intent ( Lessons1.this, com.mcal.kotlinfree.lessons.Lesson12.class );
									startActivity ( int12 );
								}
						} );
				btn13.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int13= new Intent ( Lessons1.this, com.mcal.kotlinfree.lessons.Lesson13.class );
									startActivity ( int13 );
								}
						} );
			}//onCreate
//===================================================================
	}//Lessons1
//##################################################################
