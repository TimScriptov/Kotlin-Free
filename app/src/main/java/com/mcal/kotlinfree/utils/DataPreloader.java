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
package com.mcal.kotlinfree.utils;

import android.content.Context;

import com.mcal.kotlinfree.MainActivity;
import com.mcal.kotlinfree.SdkActivity;

/**
 * @since 27.09.2018
 * @author Тимашков Иван
 * @author https://github.com/TimScriptov
 */
public class DataPreloader
	{
		private PreloadingFinishedListener mListener;
		private boolean mIsSleepingFinished = false;
		private boolean mIsPreloadingFinished = false;

		public DataPreloader ( PreloadingFinishedListener litenser )
			{
				mListener = litenser;
			}

		public void preload ( Context context_a )
			{
				final Context context = context_a;
				new Thread ( )
					{
						public void run ( )
							{
								MainActivity.mPESdk = new SdkActivity ( new UtilsSettings ( context ) );
								MainActivity.mPESdk.init ( );
								mIsPreloadingFinished = true;
								checkFinish ( );
							}
					}.start ( );

				new Thread ( )
					{
						public void run ( )
							{
								try
									{
										Thread.sleep ( 5000 );
									}
								catch (InterruptedException e)
									{}
								mIsSleepingFinished = true;
								checkFinish ( );
							}
					}.start ( );
			}

		private void checkFinish ( )
			{
				if ( mIsPreloadingFinished && mIsSleepingFinished )
					mListener.onPreloadingFinished ( );
			}

		public abstract interface PreloadingFinishedListener
			{
				void onPreloadingFinished ( );
			}
	}

