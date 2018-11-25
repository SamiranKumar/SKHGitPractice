package com.skh.samir.skhgitpractice.lifecycle.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.LoaderManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

import com.skh.samir.skhgitpractice.R;
import com.skh.samir.skhgitpractice.common.LogPrint;

import static com.skh.samir.skhgitpractice.common.Util.LifecycleState.CALL_TO_SUPER;
import static com.skh.samir.skhgitpractice.common.Util.LifecycleState.RETURN_FROM_SUPER;
import static com.skh.samir.skhgitpractice.common.Util.recLifeCycle;


public class MainActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LogPrint.print("**********************************");
        recLifeCycle(getClass(), CALL_TO_SUPER);

        super.onCreate(savedInstanceState);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
        setContentView(R.layout.activity_main);

        LogPrint.print("..");
////////////////////////////////////////////////////////
        FragmentManager.enableDebugLogging(true);
        LoaderManager.enableDebugLogging(true);
////////////////////////////////////////////////////////

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);

        LogPrint.print("..");
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onActivityResult(requestCode, resultCode, data);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);

        LogPrint.print("..");
    }

    @Override
    public void onAttachedToWindow() {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onAttachedToWindow();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);

        LogPrint.print("..");
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onAttachFragment(fragment);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);

        LogPrint.print("..");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onConfigurationChanged(newConfig);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);

        LogPrint.print("..");
    }

    @Override
    public void onContentChanged() {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onContentChanged();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);

        LogPrint.print("..");
    }

    @Override
    protected void onDestroy() {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onDestroy();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);

        LogPrint.print("...................................................");
    }

    @Override
    public void onDetachedFromWindow() {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onDetachedFromWindow();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);

        LogPrint.print("**********************************");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onNewIntent(intent);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);

        LogPrint.print("..");
    }

    @Override
    protected void onPause() {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onPause();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);

        LogPrint.print("..");
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onPostCreate(savedInstanceState);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);

        LogPrint.print("..");

    }

    @Override
    protected void onPostResume() {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onPostResume();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);

        LogPrint.print("..");
    }

    @Override
    public boolean onPrepareOptionsMenu(final Menu menu) {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        boolean result = super.onPrepareOptionsMenu(menu);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);

        LogPrint.print("..");

        return result;
    }

    @Override
    protected void onRestart() {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onRestart();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);

        LogPrint.print("..");
    }

    @Override
    protected void onResume() {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onResume();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);

        LogPrint.print("..");
    }

    @Override
    protected void onRestoreInstanceState(final Bundle savedInstanceState) {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onRestoreInstanceState(savedInstanceState);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);

        LogPrint.print("..");
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onWindowFocusChanged(hasFocus);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);

        LogPrint.print("..");
    }

    @Override
    protected void onUserLeaveHint() {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onUserLeaveHint();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);

        LogPrint.print("..");
    }

    @Override
    protected void onStart() {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onStart();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);

        LogPrint.print("..");
    }

    @Override
    protected void onStop() {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onStop();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);

        LogPrint.print("..");
    }

    @Override
    protected void onSaveInstanceState(final Bundle outState) {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onSaveInstanceState(outState);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);

        LogPrint.print("..");
    }

    @Override
    public void onUserInteraction() {
        recLifeCycle(getClass(), CALL_TO_SUPER);
        super.onUserInteraction();
        recLifeCycle(getClass(), RETURN_FROM_SUPER);

        LogPrint.print("..");
    }
}



//////
/*   →☐☐ before call supper method
/*   ☐☐→ after call  supper method
06-09 11:57:47.768 16744-16744/com.skh.samir.skhgitpractice I/LOG: **********************************
06-09 11:57:47.770 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onCreate / →☐☐
06-09 11:57:47.829 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onCreate / ☐☐→

06-09 11:57:47.997 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onContentChanged / →☐☐
06-09 11:57:47.997 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onContentChanged / ☐☐→

06-09 11:57:48.001 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onStart / →☐☐
06-09 11:57:48.001 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onStart / ☐☐→

06-09 11:57:48.001 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onPostCreate / →☐☐
06-09 11:57:48.002 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onPostCreate / ☐☐→

06-09 11:57:48.006 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onResume / →☐☐
06-09 11:57:48.008 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onResume / ☐☐→

06-09 11:57:48.008 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onPostResume / →☐☐
06-09 11:57:48.050 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onPostResume / ☐☐→

06-09 11:57:48.086 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onAttachedToWindow / →☐☐
06-09 11:57:48.086 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onAttachedToWindow / ☐☐→

06-09 11:57:48.195 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onCreateOptionsMenu / →☐☐
06-09 11:57:48.198 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onCreateOptionsMenu / ☐☐→

06-09 11:57:48.199 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onPrepareOptionsMenu / →☐☐
06-09 11:57:48.199 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onPrepareOptionsMenu / ☐☐→

06-09 11:57:48.200 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onWindowFocusChanged / →☐☐
06-09 11:57:48.200 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onWindowFocusChanged / ☐☐→

06-09 11:57:53.391 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onUserInteraction / →☐☐
06-09 11:57:53.391 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onUserInteraction / ☐☐→

06-09 11:57:53.470 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onUserInteraction / →☐☐
06-09 11:57:53.470 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onUserInteraction / ☐☐→

06-09 11:57:53.477 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onWindowFocusChanged / →☐☐
06-09 11:57:53.477 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onWindowFocusChanged / ☐☐→

06-09 11:57:53.477 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onPause / →☐☐
06-09 11:57:53.477 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onPause / ☐☐→

06-09 11:57:54.010 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onStop / →☐☐
06-09 11:57:54.010 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onStop / ☐☐→

06-09 11:57:54.010 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onDestroy / →☐☐
06-09 11:57:54.010 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onDestroy / ☐☐→
06-09 11:57:54.010 16744-16744/com.skh.samir.skhgitpractice I/LOG: ...................................................
06-09 11:57:54.011 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onDetachedFromWindow / →☐☐
06-09 11:57:54.011 16744-16744/com.skh.samir.skhgitpractice I/LOG: MainActivity.onDetachedFromWindow / ☐☐→
06-09 11:57:54.011 16744-16744/com.skh.samir.skhgitpractice I/LOG: **********************************


...........................................................................................................................................
Rotored mood

06-09 12:03:00.193 17199-17199/com.skh.samir.skhgitpractice I/LOG: **********************************
06-09 12:03:00.196 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onCreate / →☐☐
06-09 12:03:00.287 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onCreate / ☐☐→

06-09 12:03:00.468 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onContentChanged / →☐☐
06-09 12:03:00.469 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onContentChanged / ☐☐→
06-09 12:03:00.470 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:00.471 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:00.477 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onStart / →☐☐
06-09 12:03:00.477 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onStart / ☐☐→
06-09 12:03:00.477 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:00.477 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onPostCreate / →☐☐
06-09 12:03:00.478 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onPostCreate / ☐☐→
06-09 12:03:00.478 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:00.479 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onResume / →☐☐
06-09 12:03:00.479 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onResume / ☐☐→
06-09 12:03:00.479 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:00.479 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onPostResume / →☐☐
06-09 12:03:00.508 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onPostResume / ☐☐→
06-09 12:03:00.508 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:00.548 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onAttachedToWindow / →☐☐
06-09 12:03:00.548 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onAttachedToWindow / ☐☐→
06-09 12:03:00.548 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:00.659 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onCreateOptionsMenu / →☐☐
06-09 12:03:00.662 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onCreateOptionsMenu / ☐☐→
06-09 12:03:00.662 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:00.662 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onPrepareOptionsMenu / →☐☐
06-09 12:03:00.662 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onPrepareOptionsMenu / ☐☐→
06-09 12:03:00.662 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:00.664 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onWindowFocusChanged / →☐☐
06-09 12:03:00.665 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onWindowFocusChanged / ☐☐→
06-09 12:03:00.665 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:03.948 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onPause / →☐☐
06-09 12:03:03.949 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onPause / ☐☐→
06-09 12:03:03.949 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:03.949 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onSaveInstanceState / →☐☐
06-09 12:03:03.951 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onSaveInstanceState / ☐☐→
06-09 12:03:03.951 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:03.956 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onStop / →☐☐
06-09 12:03:03.956 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onStop / ☐☐→
06-09 12:03:03.956 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:03.956 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onDestroy / →☐☐
06-09 12:03:03.956 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onDestroy / ☐☐→
06-09 12:03:03.956 17199-17199/com.skh.samir.skhgitpractice I/LOG: ...................................................
06-09 12:03:03.957 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onDetachedFromWindow / →☐☐
06-09 12:03:03.957 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onDetachedFromWindow / ☐☐→
06-09 12:03:03.957 17199-17199/com.skh.samir.skhgitpractice I/LOG: **********************************
06-09 12:03:03.974 17199-17199/com.skh.samir.skhgitpractice I/LOG: **********************************
06-09 12:03:03.974 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onCreate / →☐☐
06-09 12:03:03.975 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onCreate / ☐☐→
06-09 12:03:04.000 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onContentChanged / →☐☐
06-09 12:03:04.000 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onContentChanged / ☐☐→
06-09 12:03:04.000 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:04.000 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:04.000 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onStart / →☐☐
06-09 12:03:04.000 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onStart / ☐☐→
06-09 12:03:04.000 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:04.000 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onRestoreInstanceState / →☐☐
06-09 12:03:04.001 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onRestoreInstanceState / ☐☐→
06-09 12:03:04.001 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:04.001 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onPostCreate / →☐☐
06-09 12:03:04.001 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onPostCreate / ☐☐→
06-09 12:03:04.001 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:04.002 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onResume / →☐☐
06-09 12:03:04.002 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onResume / ☐☐→
06-09 12:03:04.002 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:04.002 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onPostResume / →☐☐
06-09 12:03:04.002 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onPostResume / ☐☐→
06-09 12:03:04.002 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:04.009 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onAttachedToWindow / →☐☐
06-09 12:03:04.009 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onAttachedToWindow / ☐☐→
06-09 12:03:04.009 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:04.065 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onCreateOptionsMenu / →☐☐
06-09 12:03:04.065 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onCreateOptionsMenu / ☐☐→
06-09 12:03:04.066 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:04.066 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onPrepareOptionsMenu / →☐☐
06-09 12:03:04.066 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onPrepareOptionsMenu / ☐☐→
06-09 12:03:04.066 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:04.067 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onWindowFocusChanged / →☐☐
06-09 12:03:04.067 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onWindowFocusChanged / ☐☐→
06-09 12:03:04.067 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:10.077 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onPause / →☐☐
06-09 12:03:10.078 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onPause / ☐☐→
06-09 12:03:10.078 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:10.078 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onSaveInstanceState / →☐☐
06-09 12:03:10.078 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onSaveInstanceState / ☐☐→
06-09 12:03:10.078 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:10.080 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onStop / →☐☐
06-09 12:03:10.080 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onStop / ☐☐→
06-09 12:03:10.080 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:10.081 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onDestroy / →☐☐
06-09 12:03:10.081 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onDestroy / ☐☐→
06-09 12:03:10.081 17199-17199/com.skh.samir.skhgitpractice I/LOG: ...................................................
06-09 12:03:10.082 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onDetachedFromWindow / →☐☐
06-09 12:03:10.082 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onDetachedFromWindow / ☐☐→
06-09 12:03:10.082 17199-17199/com.skh.samir.skhgitpractice I/LOG: **********************************
06-09 12:03:10.100 17199-17199/com.skh.samir.skhgitpractice I/LOG: **********************************
06-09 12:03:10.101 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onCreate / →☐☐
06-09 12:03:10.110 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onCreate / ☐☐→
06-09 12:03:10.116 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onContentChanged / →☐☐
06-09 12:03:10.117 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onContentChanged / ☐☐→
06-09 12:03:10.117 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:10.118 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:10.119 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onStart / →☐☐
06-09 12:03:10.119 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onStart / ☐☐→
06-09 12:03:10.119 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:10.120 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onRestoreInstanceState / →☐☐
06-09 12:03:10.121 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onRestoreInstanceState / ☐☐→
06-09 12:03:10.121 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:10.121 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onPostCreate / →☐☐
06-09 12:03:10.121 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onPostCreate / ☐☐→
06-09 12:03:10.121 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:10.123 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onResume / →☐☐
06-09 12:03:10.125 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onResume / ☐☐→
06-09 12:03:10.125 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:10.126 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onPostResume / →☐☐
06-09 12:03:10.126 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onPostResume / ☐☐→
06-09 12:03:10.126 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:10.142 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onAttachedToWindow / →☐☐
06-09 12:03:10.142 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onAttachedToWindow / ☐☐→
06-09 12:03:10.142 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:10.228 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onCreateOptionsMenu / →☐☐
06-09 12:03:10.230 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onCreateOptionsMenu / ☐☐→
06-09 12:03:10.231 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:10.231 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onPrepareOptionsMenu / →☐☐
06-09 12:03:10.231 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onPrepareOptionsMenu / ☐☐→
06-09 12:03:10.232 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:10.232 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onWindowFocusChanged / →☐☐
06-09 12:03:10.232 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onWindowFocusChanged / ☐☐→
06-09 12:03:10.232 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:13.145 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onWindowFocusChanged / →☐☐
06-09 12:03:13.145 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onWindowFocusChanged / ☐☐→
06-09 12:03:13.145 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:13.145 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onUserInteraction / →☐☐
06-09 12:03:13.145 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onUserInteraction / ☐☐→
06-09 12:03:13.145 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:13.145 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onUserLeaveHint / →☐☐
06-09 12:03:13.145 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onUserLeaveHint / ☐☐→
06-09 12:03:13.145 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:13.145 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onPause / →☐☐
06-09 12:03:13.145 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onPause / ☐☐→
06-09 12:03:13.145 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:13.202 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onSaveInstanceState / →☐☐
06-09 12:03:13.203 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onSaveInstanceState / ☐☐→
06-09 12:03:13.203 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..
06-09 12:03:13.210 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onStop / →☐☐
06-09 12:03:13.211 17199-17199/com.skh.samir.skhgitpractice I/LOG: MainActivity.onStop / ☐☐→
06-09 12:03:13.211 17199-17199/com.skh.samir.skhgitpractice I/LOG: ..



 */