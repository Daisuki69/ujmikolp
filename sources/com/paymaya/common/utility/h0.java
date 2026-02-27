package com.paymaya.common.utility;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.core.app.ShareCompat;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.common.MimeTypes;
import com.paymaya.ui.common.view.dialog.impl.ShareSaveDialogFragment;
import defpackage.AbstractC1414e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f11208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f11209b;
    public View[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f11210d;
    public boolean e;
    public Paint f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11211g;
    public g0 h;

    public static Uri c(FragmentActivity fragmentActivity, File file) {
        return FileProvider.getUriForFile(fragmentActivity, fragmentActivity.getPackageName() + ".fileprovider", file);
    }

    public static h0 d(View view, g0 g0Var) {
        h0 h0Var = new h0();
        h0Var.e = true;
        h0Var.f11211g = 0;
        h0Var.f11208a = view;
        h0Var.h = g0Var;
        return h0Var;
    }

    public static void g(FragmentActivity fragmentActivity, String str, File file) {
        Uri uriC = c(fragmentActivity, file);
        ComponentName componentName = fragmentActivity.getComponentName();
        Intent action = new Intent().setAction("android.intent.action.SEND");
        action.putExtra(ShareCompat.EXTRA_CALLING_PACKAGE, fragmentActivity.getPackageName());
        action.putExtra(ShareCompat.EXTRA_CALLING_PACKAGE_INTEROP, fragmentActivity.getPackageName());
        action.putExtra(ShareCompat.EXTRA_CALLING_ACTIVITY, componentName);
        action.putExtra(ShareCompat.EXTRA_CALLING_ACTIVITY_INTEROP, componentName);
        action.addFlags(524288);
        action.addFlags(1);
        String name = file.getName();
        action.setType(MimeTypes.IMAGE_JPEG);
        action.putExtra("android.intent.extra.STREAM", uriC);
        ShareSaveDialogFragment shareSaveDialogFragment = new ShareSaveDialogFragment();
        Bundle bundleE = androidx.media3.datasource.cache.c.e("title", str, "filename", name);
        bundleE.putParcelable("intent", action);
        shareSaveDialogFragment.setArguments(bundleE);
        if (!AbstractC1414e.u(fragmentActivity)) {
            fragmentActivity = null;
        }
        if (fragmentActivity != null) {
            shareSaveDialogFragment.show(fragmentActivity.getSupportFragmentManager(), "share");
        }
    }

    public final void a(int i, int i4, String str) {
        int i6 = i4 + this.f11211g;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i6, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = this.f;
        if (paint != null) {
            canvas.drawRect(0.0f, 0.0f, i, i6, paint);
        }
        View view = this.f11209b;
        if (view != null) {
            view.draw(canvas);
        }
        canvas.translate(0.0f, this.f11211g);
        View view2 = this.f11208a;
        view2.draw(canvas);
        Context context = view2.getContext();
        bitmapCreateBitmap.getWidth();
        bitmapCreateBitmap.getHeight();
        int width = (int) ((((double) 1080) / ((double) bitmapCreateBitmap.getWidth())) * ((double) bitmapCreateBitmap.getHeight()));
        File file = new File(context.getCacheDir(), "Pictures");
        file.mkdirs();
        File file2 = new File(file, str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            Bitmap.createScaledBitmap(bitmapCreateBitmap, 1080, width, false).compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException unused) {
            yk.a.e();
        }
        this.h.b(file2);
    }

    public final void b(String str) {
        View[] viewArr = this.c;
        View view = this.f11208a;
        if (viewArr == null || viewArr.length == 0) {
            a(view.getWidth(), view.getHeight(), str);
            return;
        }
        view.addOnLayoutChangeListener(new f0(this, str));
        int i = 0;
        while (true) {
            View[] viewArr2 = this.c;
            if (i >= viewArr2.length) {
                return;
            }
            View view2 = viewArr2[i];
            this.f11210d[i] = view2.getVisibility();
            view2.setVisibility(this.e ? 0 : 8);
            i++;
        }
    }

    public final void e(int i) {
        Paint paint = new Paint();
        this.f = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f.setColor(i);
    }

    public final void f(View... viewArr) {
        this.e = false;
        this.c = (View[]) viewArr.clone();
        this.f11210d = new int[viewArr.length];
    }
}
