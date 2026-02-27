package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public final class PendingIntentCompat {

    @RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
        }

        public static void send(PendingIntent pendingIntent, Context context, int i, Intent intent, PendingIntent.OnFinished onFinished, Handler handler, String str, Bundle bundle) throws PendingIntent.CanceledException {
            pendingIntent.send(context, i, intent, onFinished, handler, str, bundle);
        }
    }

    @RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
        }

        public static PendingIntent getForegroundService(Context context, int i, Intent intent, int i4) {
            return PendingIntent.getForegroundService(context, i, intent, i4);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface Flags {
    }

    public static class GatedCallback implements Closeable, AutoCloseable {
        private PendingIntent.OnFinished mCallback;
        private final CountDownLatch mComplete = new CountDownLatch(1);
        private boolean mSuccess = false;

        public GatedCallback(PendingIntent.OnFinished onFinished) {
            this.mCallback = onFinished;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onSendFinished(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
            boolean z4 = false;
            while (true) {
                try {
                    this.mComplete.await();
                    break;
                } catch (InterruptedException unused) {
                    z4 = true;
                    pendingIntent = pendingIntent;
                    intent = intent;
                    i = i;
                    str = str;
                    bundle = bundle;
                } catch (Throwable th2) {
                    if (!z4) {
                        throw th2;
                    }
                    Thread.currentThread().interrupt();
                    throw th2;
                }
            }
            if (z4) {
                Thread.currentThread().interrupt();
            }
            PendingIntent.OnFinished onFinished = this.mCallback;
            if (onFinished != null) {
                onFinished.onSendFinished(pendingIntent, intent, i, str, bundle);
                this.mCallback = null;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.mSuccess) {
                this.mCallback = null;
            }
            this.mComplete.countDown();
        }

        public void complete() {
            this.mSuccess = true;
        }

        public PendingIntent.OnFinished getCallback() {
            if (this.mCallback == null) {
                return null;
            }
            return new PendingIntent.OnFinished() { // from class: androidx.core.app.c
                @Override // android.app.PendingIntent.OnFinished
                public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
                    this.f7762a.onSendFinished(pendingIntent, intent, i, str, bundle);
                }
            };
        }
    }

    private PendingIntentCompat() {
    }

    public static int addMutabilityFlags(boolean z4, int i) {
        int i4;
        if (!z4) {
            i4 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                return i;
            }
            i4 = 33554432;
        }
        return i4 | i;
    }

    public static PendingIntent getActivities(Context context, int i, @SuppressLint({"ArrayReturn"}) Intent[] intentArr, int i4, Bundle bundle, boolean z4) {
        return PendingIntent.getActivities(context, i, intentArr, addMutabilityFlags(z4, i4), bundle);
    }

    public static PendingIntent getActivity(Context context, int i, Intent intent, int i4, boolean z4) {
        return PendingIntent.getActivity(context, i, intent, addMutabilityFlags(z4, i4));
    }

    public static PendingIntent getBroadcast(Context context, int i, Intent intent, int i4, boolean z4) {
        return PendingIntent.getBroadcast(context, i, intent, addMutabilityFlags(z4, i4));
    }

    @RequiresApi(26)
    public static PendingIntent getForegroundService(Context context, int i, Intent intent, int i4, boolean z4) {
        return Api26Impl.getForegroundService(context, i, intent, addMutabilityFlags(z4, i4));
    }

    public static PendingIntent getService(Context context, int i, Intent intent, int i4, boolean z4) {
        return PendingIntent.getService(context, i, intent, addMutabilityFlags(z4, i4));
    }

    @SuppressLint({"LambdaLast"})
    public static void send(PendingIntent pendingIntent, int i, PendingIntent.OnFinished onFinished, Handler handler) throws PendingIntent.CanceledException {
        GatedCallback gatedCallback = new GatedCallback(onFinished);
        try {
            pendingIntent.send(i, gatedCallback.getCallback(), handler);
            gatedCallback.complete();
            gatedCallback.close();
        } catch (Throwable th2) {
            try {
                gatedCallback.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static PendingIntent getActivities(Context context, int i, @SuppressLint({"ArrayReturn"}) Intent[] intentArr, int i4, boolean z4) {
        return PendingIntent.getActivities(context, i, intentArr, addMutabilityFlags(z4, i4));
    }

    public static PendingIntent getActivity(Context context, int i, Intent intent, int i4, Bundle bundle, boolean z4) {
        return PendingIntent.getActivity(context, i, intent, addMutabilityFlags(z4, i4), bundle);
    }

    @SuppressLint({"LambdaLast"})
    public static void send(PendingIntent pendingIntent, @SuppressLint({"ContextFirst"}) Context context, int i, Intent intent, PendingIntent.OnFinished onFinished, Handler handler) throws PendingIntent.CanceledException {
        send(pendingIntent, context, i, intent, onFinished, handler, null, null);
    }

    @SuppressLint({"LambdaLast"})
    public static void send(PendingIntent pendingIntent, @SuppressLint({"ContextFirst"}) Context context, int i, Intent intent, PendingIntent.OnFinished onFinished, Handler handler, String str, Bundle bundle) throws PendingIntent.CanceledException {
        GatedCallback gatedCallback = new GatedCallback(onFinished);
        try {
            Api23Impl.send(pendingIntent, context, i, intent, onFinished, handler, str, bundle);
            gatedCallback.complete();
            gatedCallback.close();
        } finally {
        }
    }
}
