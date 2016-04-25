package com.manuelblanco.builditbigger;

import android.test.AndroidTestCase;
import android.util.Log;

/**
 * Created by manuel on 20/04/16.
 */
public class EmptyStringTest extends AndroidTestCase {

    private static final String TAG = EmptyStringTest.class.getSimpleName();

    public void test() {

        String result = null;
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(getContext(), null,null);
        endpointsAsyncTask.execute();

        try {
            result = endpointsAsyncTask.get();
            Log.d(TAG, "Retrieved a non-empty string successfully: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertNotNull(result);
    }
}
