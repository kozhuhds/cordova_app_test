package com.altoros.arrivalnotifier;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import android.provider.MediaStore;
import android.util.Log;


public class ArrivalNotifier extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) {
        String result = "";

        if (action.equals("getRoute")) {
            getRoute();
        } else if (action.equals("makePhoto")) {
            openPhotoCamera();
            return true;
        }

        return false;
    }

	private void getRoute() {
        //Intent intent = new Intent();
        //this.cordova.getActivity().startActivity(intent);
    }

    private void openPhotoCamera() {
        System.out.println("YESSSSSSS");
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        this.cordova.getActivity().startActivity(intent);
    }

}