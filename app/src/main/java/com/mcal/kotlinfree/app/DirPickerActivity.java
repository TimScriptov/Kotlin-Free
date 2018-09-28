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

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.mcal.kotlinfree.R;
import com.mcal.kotlinfree.utils.KotlinOptions;

import java.io.File;
import java.util.ArrayList;
import com.mcal.kotlinfree.app.BaseActivity;

/**
 * @since 27.09.2018
 * @author Тимашков Иван
 * @author https://github.com/TimScriptov
 */
public class DirPickerActivity extends BaseActivity
	{
		public static final int REQUEST_PICK_DIR = 3;
		public final static String TAG_DIR_PATH = "dir_path";
		
		public static void startThisActivity ( Activity context, File path )
			{
				startThisActivity ( context, path.getPath ( ) );
			}

		public static void startThisActivity ( Activity context, String path )
			{
				Intent intent = new Intent ( context, DirPickerActivity.class );
				Bundle extras = new Bundle ( );
				extras.putString ( TAG_DIR_PATH, path );
				intent.putExtras ( extras );
				context.startActivityForResult ( intent, REQUEST_PICK_DIR );
			}

		public static void startThisActivity ( Activity context )
			{
				startThisActivity ( context, Environment.getExternalStorageDirectory ( ).getPath ( ) );
			}
	}
