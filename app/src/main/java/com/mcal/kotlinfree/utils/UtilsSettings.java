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
import android.content.SharedPreferences;

import com.mcal.kotlinfree.utils.KotlinOptions;

/**
 * @since 27.09.2018
 * @author Тимашков Иван
 * @author https://github.com/TimScriptov
 */
public class UtilsSettings implements KotlinOptions
	{
		private Context mContext;
		private final static String TAG_SETTINGS = "kotlin_settings";
		private final static String TAG_FIRST_LOADED = "first_loaded";
		private final static String TAG_DATA_SAVED_PATH = "data_saved_path";
		private final static String TAG_LANGUAGE = "language_type";

		public UtilsSettings ( Context context )
			{
				this.mContext = context;
			}

		public void setFirstLoaded ( boolean z )
			{
				SharedPreferences.Editor editor = mContext.getSharedPreferences ( TAG_SETTINGS, Context.MODE_PRIVATE ).edit ( );
				editor.putBoolean ( TAG_FIRST_LOADED, z );
				editor.apply ( );
			}

		public boolean isFirstLoaded ( )
			{
				return mContext.getSharedPreferences ( TAG_SETTINGS, Context.MODE_PRIVATE ).getBoolean ( TAG_FIRST_LOADED, false );
			}

		public void setLanguageType ( int z )
			{
				SharedPreferences.Editor editor = mContext.getSharedPreferences ( TAG_SETTINGS, Context.MODE_PRIVATE ).edit ( );
				editor.putInt ( TAG_LANGUAGE, z );
				editor.apply ( );
			}

		public int getLanguageType ( )
			{
				return mContext.getSharedPreferences ( TAG_SETTINGS, Context.MODE_PRIVATE ).getInt ( TAG_LANGUAGE, 0 );
			}

		@Override
		public String getDataSavedPath ( )
			{
				return mContext.getSharedPreferences ( TAG_SETTINGS, Context.MODE_PRIVATE ).getString ( TAG_DATA_SAVED_PATH, STRING_VALUE_DEFAULT );
			}

		public void setDataSavedPath ( String z )
			{
				SharedPreferences.Editor editor = mContext.getSharedPreferences ( TAG_SETTINGS, Context.MODE_PRIVATE ).edit ( );
				editor.putString ( TAG_DATA_SAVED_PATH, z );
				editor.apply ( );
			}
	}
