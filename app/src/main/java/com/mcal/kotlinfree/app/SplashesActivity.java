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
package com.mcal.kotlinfree.app;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;

import com.mcal.kotlinfree.R;
import com.mcal.kotlinfree.utils.DataPreloader;
import com.mcal.kotlinfree.app.BaseActivity;
import com.mcal.kotlinfree.MainActivity;

/**
 * @since 27.09.2018
 * @author Тимашков Иван
 * @author https://github.com/TimScriptov
 */
public class SplashesActivity extends BaseActivity implements DataPreloader.PreloadingFinishedListener
	{
		@Override
		protected void onCreate ( Bundle savedInstanceState )
			{
				super.onCreate ( savedInstanceState );
				setContentView ( R.layout.kotlin_splashes );

				initInstance ( );
			}

		@Override
		public void onWindowFocusChanged ( boolean hasFocus )
			{
				super.onWindowFocusChanged ( hasFocus );
				if ( hasFocus && Build.VERSION.SDK_INT >= 19 )
					{
						View decorView = getWindow ( ).getDecorView ( );
						decorView.setSystemUiVisibility (
							View.SYSTEM_UI_FLAG_LAYOUT_STABLE
							| View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
							| View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
							| View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
							| View.SYSTEM_UI_FLAG_FULLSCREEN
							| View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY );
					}
			}

		private void initInstance ( )
			{
				new DataPreloader ( this ).preload ( getApplicationContext ( ) );
			}

		Handler mHandler = new Handler ( )
			{

				@Override
				public void handleMessage ( Message msg )
					{
						super.handleMessage ( msg );

						Intent intent = new Intent ( SplashesActivity.this, MainActivity.class );
						startActivity ( intent );
						finish ( );
					}
			};

		@Override
		public void onPreloadingFinished ( )
			{
				mHandler.sendEmptyMessage ( 0 );
			}
	}

