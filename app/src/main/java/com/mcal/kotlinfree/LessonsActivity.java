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
public class LessonsActivity extends AppCompatActivity
//##################################################################
	{
		AdView mAdView;
//===================================================================
		@Override
		protected void onCreate ( Bundle savedInstanceState )
//===================================================================
			{
				super.onCreate ( savedInstanceState );
				setContentView ( R.layout.lessons );

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
				Button btn26=(Button) findViewById ( R.id.btnLesson26 );
				Button btn27=(Button) findViewById ( R.id.btnLesson27 );
				Button btn28=(Button) findViewById ( R.id.btnLesson28 );
				Button btn29=(Button) findViewById ( R.id.btnLesson29 );
				Button btn30=(Button) findViewById ( R.id.btnLesson30 );
				Button btn31=(Button) findViewById ( R.id.btnLesson31 );
				Button btn32=(Button) findViewById ( R.id.btnLesson32 );
				Button btn33=(Button) findViewById ( R.id.btnLesson33 );
				Button btn34=(Button) findViewById ( R.id.btnLesson34 );
				Button btn35=(Button) findViewById ( R.id.btnLesson35 );
				Button btn36=(Button) findViewById ( R.id.btnLesson36 );
				btn1.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int1= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson1.class );
									startActivity ( int1 );
								}
						} );
				btn2.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int2= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson2.class );
									startActivity ( int2 );
								}
						} );
				btn3.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int3= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson3.class );
									startActivity ( int3 );
								}
						} );
				btn4.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int4= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson4.class );
									startActivity ( int4 );
								}
						} );
				btn5.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int5= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson5.class );
									startActivity ( int5 );
								}
						} );
				btn6.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int6= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson6.class );
									startActivity ( int6 );
								}
						} );
				btn7.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int7= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson7.class );
									startActivity ( int7 );
								}
						} );
				btn8.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int8= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson8.class );
									startActivity ( int8 );
								}
						} );
				btn9.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int9= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson9.class );
									startActivity ( int9 );
								}
						} );
				btn10.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int10= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson10.class );
									startActivity ( int10 );
								}
						} );
				btn11.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int11= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson11.class );
									startActivity ( int11 );
								}
						} );
				btn12.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int12= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson12.class );
									startActivity ( int12 );
								}
						} );
				btn13.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int13= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson13.class );
									startActivity ( int13 );
								}
						} );
				btn14.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int14= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson14.class );
									startActivity ( int14 );
								}
						} );
				btn15.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int15= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson15.class );
									startActivity ( int15 );
								}
						} );
				btn16.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int16= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson16.class );
									startActivity ( int16 );
								}
						} );
				btn17.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int17= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson17.class );
									startActivity ( int17 );
								}
						} );
				btn18.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int18= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson18.class );
									startActivity ( int18 );
								}
						} );
				btn19.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int19= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson19.class );
									startActivity ( int19 );
								}
						} );
				btn20.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int20= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson20.class );
									startActivity ( int20 );
								}
						} );
				btn21.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int21= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson21.class );
									startActivity ( int21 );
								}
						} );


				btn22.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int22= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson22.class );
									startActivity ( int22 );
								}
						} );
				btn23.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int23= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson23.class );
									startActivity ( int23 );
								}
						} );
				btn24.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int24= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson24.class );
									startActivity ( int24 );
								}
						} );
				btn25.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int25= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson25.class );
									startActivity ( int25 );
								}
						} );
				btn26.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int26= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson26.class );
									startActivity ( int26 );
								}
						} );
				btn27.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int27= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson27.class );
									startActivity ( int27 );
								}
						} );
				btn28.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int28= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson28.class );
									startActivity ( int28 );
								}
						} );
				btn29.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int29= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson29.class );
									startActivity ( int29 );
								}
						} );
				btn30.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int30= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson30.class );
									startActivity ( int30 );
								}
						} );
				btn31.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int31= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson31.class );
									startActivity ( int31 );
								}
						} );
				btn32.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int32= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson32.class );
									startActivity ( int32 );
								}
						} );
				btn33.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int33= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson33.class );
									startActivity ( int33 );
								}
						} );
				btn34.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int34= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson34.class );
									startActivity ( int34 );
								}
						} );
				btn35.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int35= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson35.class );
									startActivity ( int35 );
								}
						} );
				btn36.setOnClickListener ( new View.OnClickListener ( ) {
							@Override
							public void onClick ( View v )
								{

									Intent int36= new Intent ( LessonsActivity.this, com.mcal.kotlinfree.lessons.Lesson36.class );
									startActivity ( int36 );
								}
						} );
			}//onCreate
//===================================================================
	}//LessonsActivity
//##################################################################
