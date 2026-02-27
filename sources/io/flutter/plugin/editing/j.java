package io.flutter.plugin.editing;

import D8.C0193a;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import androidx.camera.video.AudioStats;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.engine.systemchannels.TextInputChannel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements TextInputChannel.TextInputMethodHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f17197a;

    public j(k kVar) {
        this.f17197a = kVar;
    }

    @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
    public final void clearClient() {
        k kVar = this.f17197a;
        if (kVar.e.f1542b == 3) {
            return;
        }
        kVar.h.e(kVar);
        kVar.d();
        kVar.f = null;
        kVar.e(null);
        kVar.e = new F3.a(1, 0, 6);
        kVar.f17203l = null;
    }

    @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
    public final void finishAutofillContext(boolean z4) {
        AutofillManager autofillManager;
        if (Build.VERSION.SDK_INT < 26 || (autofillManager = this.f17197a.c) == null) {
            return;
        }
        if (z4) {
            autofillManager.commit();
        } else {
            autofillManager.cancel();
        }
    }

    @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
    public final void hide() {
        k kVar = this.f17197a;
        if (kVar.e.f1542b == 4) {
            kVar.d();
            return;
        }
        FlutterView flutterView = kVar.f17198a;
        kVar.d();
        kVar.f17199b.hideSoftInputFromWindow(flutterView.getApplicationWindowToken(), 0);
    }

    @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
    public final void requestAutofill() {
        int i = Build.VERSION.SDK_INT;
        k kVar = this.f17197a;
        if (i < 26) {
            kVar.getClass();
            return;
        }
        if (kVar.c == null || kVar.f17201g == null) {
            return;
        }
        String str = kVar.f.autofill.uniqueIdentifier;
        int[] iArr = new int[2];
        FlutterView flutterView = kVar.f17198a;
        flutterView.getLocationOnScreen(iArr);
        Rect rect = new Rect(kVar.f17203l);
        rect.offset(iArr[0], iArr[1]);
        kVar.c.notifyViewEntered(flutterView, str.hashCode(), rect);
    }

    @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
    public final void sendAppPrivateCommand(String str, Bundle bundle) {
        k kVar = this.f17197a;
        kVar.f17199b.sendAppPrivateCommand(kVar.f17198a, str, bundle);
    }

    @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
    public final void setClient(int i, TextInputChannel.Configuration configuration) {
        k kVar = this.f17197a;
        kVar.d();
        kVar.f = configuration;
        kVar.e = new F3.a(2, i, 6);
        kVar.h.e(kVar);
        TextInputChannel.Configuration.Autofill autofill = configuration.autofill;
        kVar.h = new g(autofill != null ? autofill.editState : null, kVar.f17198a);
        kVar.e(configuration);
        kVar.i = true;
        if (kVar.e.f1542b == 3) {
            kVar.f17205o = false;
        }
        kVar.f17203l = null;
        kVar.h.a(kVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [double[], java.io.Serializable] */
    @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
    public final void setEditableSizeAndTransform(double d10, double d11, double[] dArr) {
        k kVar = this.f17197a;
        kVar.getClass();
        ?? r72 = new double[4];
        boolean z4 = dArr[3] == AudioStats.AUDIO_AMPLITUDE_NONE && dArr[7] == AudioStats.AUDIO_AMPLITUDE_NONE && dArr[15] == 1.0d;
        double d12 = dArr[12];
        double d13 = dArr[15];
        double d14 = d12 / d13;
        r72[1] = d14;
        r72[0] = d14;
        double d15 = dArr[13] / d13;
        r72[3] = d15;
        r72[2] = d15;
        C0193a c0193a = new C0193a(z4, dArr, (Serializable) r72, 5);
        c0193a.d(d10, AudioStats.AUDIO_AMPLITUDE_NONE);
        c0193a.d(d10, d11);
        c0193a.d(AudioStats.AUDIO_AMPLITUDE_NONE, d11);
        double d16 = kVar.f17198a.getContext().getResources().getDisplayMetrics().density;
        kVar.f17203l = new Rect((int) (r72[0] * d16), (int) (r72[2] * d16), (int) Math.ceil(r72[1] * d16), (int) Math.ceil(r72[3] * d16));
    }

    @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
    public final void setEditingState(TextInputChannel.TextEditState textEditState) {
        TextInputChannel.TextEditState textEditState2;
        k kVar = this.f17197a;
        FlutterView flutterView = kVar.f17198a;
        if (!kVar.i && (textEditState2 = kVar.f17204n) != null && textEditState2.hasComposing()) {
            TextInputChannel.TextEditState textEditState3 = kVar.f17204n;
            int i = textEditState3.composingEnd - textEditState3.composingStart;
            boolean z4 = true;
            if (i == textEditState.composingEnd - textEditState.composingStart) {
                int i4 = 0;
                while (true) {
                    if (i4 >= i) {
                        z4 = false;
                        break;
                    } else if (textEditState3.text.charAt(textEditState3.composingStart + i4) != textEditState.text.charAt(textEditState.composingStart + i4)) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            kVar.i = z4;
        }
        kVar.f17204n = textEditState;
        kVar.h.f(textEditState);
        if (kVar.i) {
            kVar.f17199b.restartInput(flutterView);
            kVar.i = false;
        }
    }

    @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
    public final void setPlatformViewClient(int i, boolean z4) {
        k kVar = this.f17197a;
        if (!z4) {
            kVar.getClass();
            kVar.e = new F3.a(4, i, 6);
            kVar.j = null;
        } else {
            FlutterView flutterView = kVar.f17198a;
            flutterView.requestFocus();
            kVar.e = new F3.a(3, i, 6);
            kVar.f17199b.restartInput(flutterView);
            kVar.i = false;
        }
    }

    @Override // io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputMethodHandler
    public final void show() {
        TextInputChannel.InputType inputType;
        k kVar = this.f17197a;
        FlutterView flutterView = kVar.f17198a;
        TextInputChannel.Configuration configuration = kVar.f;
        InputMethodManager inputMethodManager = kVar.f17199b;
        if (configuration == null || (inputType = configuration.inputType) == null || inputType.type != TextInputChannel.TextInputType.NONE) {
            flutterView.requestFocus();
            inputMethodManager.showSoftInput(flutterView, 0);
        } else {
            kVar.d();
            inputMethodManager.hideSoftInputFromWindow(flutterView.getApplicationWindowToken(), 0);
        }
    }
}
