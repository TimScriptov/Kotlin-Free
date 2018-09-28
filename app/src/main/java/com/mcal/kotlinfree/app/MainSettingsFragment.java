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

import android.Manifest;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.provider.Settings;

import com.mcal.kotlinfree.R;
import com.mcal.kotlinfree.utils.I18n;
import com.mcal.kotlinfree.utils.UtilsSettings;
import com.mcal.kotlinfree.utils.KotlinOptions;
import com.mcal.kotlinfree.app.AboutActivity;
import com.mcal.kotlinfree.MainActivity;
import android.support.v4.content.ContextCompat;
import android.support.v4.app.ActivityCompat;

/**
 * @since 25.09.2018
 * @author Тимашков Иван
 * @author https://github.com/TimScriptov
 */
public class MainSettingsFragment extends PreferenceFragment
	{
		private UtilsSettings mSettings = null;

		private Preference mAboutPreference = null;

		private ListPreference mLanguagePreference = null;
		@Override
		public void onCreate ( Bundle savedInstanceState )
			{
				super.onCreate ( savedInstanceState );
				addPreferencesFromResource ( R.xml.preferences );

				mSettings = new UtilsSettings ( getActivity ( ) );

				mAboutPreference = findPreference ( "about" );
				mAboutPreference.setOnPreferenceClickListener ( new Preference.OnPreferenceClickListener ( )
						{

							@Override
							public boolean onPreferenceClick ( Preference p1 )
								{
									Intent intent = new Intent ( getActivity ( ), AboutActivity.class );
									getActivity ( ).startActivity ( intent );
									return true;
								}


						} );

				mLanguagePreference = (ListPreference)findPreference ( "language" );
				mLanguagePreference.setOnPreferenceChangeListener ( new Preference.OnPreferenceChangeListener ( )
						{

							@Override
							public boolean onPreferenceChange ( Preference p1, Object p2 )
								{
									int type = Integer.valueOf ( (String)p2 );
									mSettings.setLanguageType ( type );
									I18n.setLanguage ( getActivity ( ) );
									Intent intent = new Intent ( getActivity ( ), SplashesActivity.class );
									intent.setFlags ( Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP );
									startActivity ( intent );
									return true;
								}


						} );
			}
	}

