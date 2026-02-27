package io.flutter.plugin.editing;

import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.util.SparseArray;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.engine.systemchannels.TextInputChannel;
import io.flutter.plugin.platform.u;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlutterView f17198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputMethodManager f17199b;
    public final AutofillManager c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextInputChannel f17200d;
    public F3.a e = new F3.a(1, 0, 6);
    public TextInputChannel.Configuration f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SparseArray f17201g;
    public g h;
    public boolean i;
    public InputConnection j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u f17202k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Rect f17203l;
    public final ImeSyncDeferringInsetsCallback m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextInputChannel.TextEditState f17204n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f17205o;

    public k(FlutterView flutterView, TextInputChannel textInputChannel, u uVar) {
        this.f17198a = flutterView;
        this.h = new g(null, flutterView);
        this.f17199b = (InputMethodManager) flutterView.getContext().getSystemService("input_method");
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.c = androidx.media3.common.util.e.n(flutterView.getContext().getSystemService(androidx.media3.common.util.e.q()));
        } else {
            this.c = null;
        }
        if (i >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(flutterView);
            this.m = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.f17200d = textInputChannel;
        textInputChannel.setTextInputMethodHandler(new j(this));
        textInputChannel.requestExistingInputState();
        this.f17202k = uVar;
        uVar.f = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        if (r5 == r8.composingEnd) goto L29;
     */
    @Override // io.flutter.plugin.editing.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r8) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.k.a(boolean):void");
    }

    public final void b(int i) {
        F3.a aVar = this.e;
        int i4 = aVar.f1542b;
        if ((i4 == 3 || i4 == 4) && aVar.c == i) {
            this.e = new F3.a(1, 0, 6);
            d();
            FlutterView flutterView = this.f17198a;
            IBinder applicationWindowToken = flutterView.getApplicationWindowToken();
            InputMethodManager inputMethodManager = this.f17199b;
            inputMethodManager.hideSoftInputFromWindow(applicationWindowToken, 0);
            inputMethodManager.restartInput(flutterView);
            this.i = false;
        }
    }

    public final void c() {
        this.f17202k.f = null;
        this.f17200d.setTextInputMethodHandler(null);
        d();
        this.h.e(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.m;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public final void d() {
        AutofillManager autofillManager;
        TextInputChannel.Configuration configuration;
        TextInputChannel.Configuration.Autofill autofill;
        if (Build.VERSION.SDK_INT < 26 || (autofillManager = this.c) == null || (configuration = this.f) == null || (autofill = configuration.autofill) == null || this.f17201g == null) {
            return;
        }
        autofillManager.notifyViewExited(this.f17198a, autofill.uniqueIdentifier.hashCode());
    }

    public final void e(TextInputChannel.Configuration configuration) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (configuration == null || configuration.autofill == null) {
            this.f17201g = null;
            return;
        }
        TextInputChannel.Configuration[] configurationArr = configuration.fields;
        SparseArray sparseArray = new SparseArray();
        this.f17201g = sparseArray;
        if (configurationArr == null) {
            sparseArray.put(configuration.autofill.uniqueIdentifier.hashCode(), configuration);
            return;
        }
        for (TextInputChannel.Configuration configuration2 : configurationArr) {
            TextInputChannel.Configuration.Autofill autofill = configuration2.autofill;
            if (autofill != null) {
                this.f17201g.put(autofill.uniqueIdentifier.hashCode(), configuration2);
                this.c.notifyValueChanged(this.f17198a, autofill.uniqueIdentifier.hashCode(), AutofillValue.forText(autofill.editState.text));
            }
        }
    }
}
