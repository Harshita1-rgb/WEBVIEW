package com.example.webview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class WebAppInterface {
    private Context mContext;

    WebAppInterface(Context c) {
        mContext = c;
    }

    @JavascriptInterface
    public void showToast(String toast) {
        Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show();
    }

    @JavascriptInterface
    public void showBrowser(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        mContext.startActivity(intent);
    }
}
