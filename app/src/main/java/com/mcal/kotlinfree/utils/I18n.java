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

import android.app.Activity;
import android.content.res.Configuration;

import java.util.Locale;

/**
 * @since 27.09.2018
 * @author Тимашков Иван
 * @author https://github.com/TimScriptov
 */
public class I18n
	{
		public static void setLanguage(Activity context)
			{
				int type = new UtilsSettings(context).getLanguageType();

				Locale defaultLocale = context.getResources().getConfiguration().locale;
				Configuration config = context.getResources().getConfiguration();

				switch (type)
					{
						case 0:
						default:
							config.locale = Locale.getDefault();
							break;
						case 1:
							config.locale = Locale.ENGLISH;
							break;
						case 2:
							config.locale = new Locale("ru", "RU");
							break;
						case 3:
							config.locale = new Locale("uk", "UK");
							break;
					}
				if (!defaultLocale.equals(config.locale))
					context.getResources().updateConfiguration(config, context.getResources().getDisplayMetrics());

			}
	}
