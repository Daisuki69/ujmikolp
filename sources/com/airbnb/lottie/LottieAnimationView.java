package com.airbnb.lottie;

import A.c;
import Ci.b;
import D.CallableC0192z;
import K.d;
import We.C0600d;
import Z.n;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.video.AudioStats;
import androidx.core.view.ViewCompat;
import com.paymaya.R;
import d4.AbstractC1331a;
import defpackage.AbstractC1414e;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import n.AbstractC1870A;
import n.AbstractC1873D;
import n.AbstractC1874a;
import n.AbstractC1876c;
import n.AbstractC1883j;
import n.C1872C;
import n.C1877d;
import n.C1878e;
import n.C1880g;
import n.C1887n;
import n.CallableC1879f;
import n.CallableC1882i;
import n.EnumC1871B;
import n.InterfaceC1875b;
import n.r;
import n.s;
import n.u;
import n.v;
import n.y;
import n.z;
import r.C2179a;
import s.C2221f;
import v.C2328c;
import z.AbstractC2543e;
import z.AbstractC2544f;
import z.ChoreographerFrameCallbackC2541c;

/* JADX INFO: loaded from: classes2.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C1877d f9403t = new C1877d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1878e f9404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1878e f9405b;
    public u c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9406d;
    public final s e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f9407g;
    public int h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9408k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f9409l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f9410n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public EnumC1871B f9411o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final HashSet f9412p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9413q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public y f9414r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C1880g f9415s;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f9416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9417b;
        public float c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f9418d;
        public String e;
        public int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f9419g;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f9416a);
            parcel.writeFloat(this.c);
            parcel.writeInt(this.f9418d ? 1 : 0);
            parcel.writeString(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.f9419g);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        String string;
        super(context, attributeSet);
        this.f9404a = new C1878e(this, 0 == true ? 1 : 0);
        this.f9405b = new C1878e(this, 1);
        this.f9406d = 0;
        s sVar = new s();
        this.e = sVar;
        this.i = false;
        this.j = false;
        this.f9408k = false;
        this.f9409l = false;
        this.m = false;
        this.f9410n = true;
        this.f9411o = EnumC1871B.f18451a;
        this.f9412p = new HashSet();
        this.f9413q = 0;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1870A.f18450a, R.attr.lottieAnimationViewStyle, 0);
        this.f9410n = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(10);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(5);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(16);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(10, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(5);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(16)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(4, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(0, false)) {
            this.f9408k = true;
            this.m = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(8, false)) {
            sVar.c.setRepeatCount(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(13)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(13, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(12)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(12, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(15, 1.0f));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(7));
        setProgress(typedArrayObtainStyledAttributes.getFloat(9, 0.0f));
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(3, false);
        if (sVar.f18493l != z4) {
            sVar.f18493l = z4;
            if (sVar.f18489b != null) {
                sVar.c();
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            sVar.a(new C2221f("**"), v.f18508F, new c(new C1872C(AppCompatResources.getColorStateList(getContext(), typedArrayObtainStyledAttributes.getResourceId(2, -1)).getDefaultColor(), PorterDuff.Mode.SRC_ATOP)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(14)) {
            sVar.f18490d = typedArrayObtainStyledAttributes.getFloat(14, 1.0f);
        }
        if (typedArrayObtainStyledAttributes.hasValue(11)) {
            int i = typedArrayObtainStyledAttributes.getInt(11, 0);
            setRenderMode(EnumC1871B.values()[i >= EnumC1871B.values().length ? 0 : i]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(6, false));
        typedArrayObtainStyledAttributes.recycle();
        Context context2 = getContext();
        C0600d c0600d = AbstractC2544f.f21341a;
        sVar.e = Settings.Global.getFloat(context2.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
        c();
        this.f = true;
    }

    private void setCompositionTask(y yVar) {
        this.f9415s = null;
        this.e.d();
        b();
        yVar.c(this.f9404a);
        yVar.b(this.f9405b);
        this.f9414r = yVar;
    }

    public final void a() {
        this.f9408k = false;
        this.j = false;
        this.i = false;
        s sVar = this.e;
        sVar.h.clear();
        sVar.c.cancel();
        c();
    }

    public final void b() {
        y yVar = this.f9414r;
        if (yVar != null) {
            C1878e c1878e = this.f9404a;
            synchronized (yVar) {
                yVar.f18534a.remove(c1878e);
            }
            this.f9414r.d(this.f9405b);
        }
    }

    @Override // android.view.View
    public final void buildDrawingCache(boolean z4) {
        this.f9413q++;
        super.buildDrawingCache(z4);
        if (this.f9413q == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z4) == null) {
            setRenderMode(EnumC1871B.f18452b);
        }
        this.f9413q--;
        AbstractC1876c.a();
    }

    public final void c() {
        C1880g c1880g;
        int i;
        int iOrdinal = this.f9411o.ordinal();
        int i4 = 2;
        if (iOrdinal == 0 ? !(((c1880g = this.f9415s) == null || !c1880g.f18465n || Build.VERSION.SDK_INT >= 28) && ((c1880g == null || c1880g.f18466o <= 4) && (i = Build.VERSION.SDK_INT) != 24 && i != 25)) : iOrdinal != 1) {
            i4 = 1;
        }
        if (i4 != getLayerType()) {
            setLayerType(i4, null);
        }
    }

    public final void d() {
        if (!isShown()) {
            this.i = true;
        } else {
            this.e.g();
            c();
        }
    }

    @Nullable
    public C1880g getComposition() {
        return this.f9415s;
    }

    public long getDuration() {
        C1880g c1880g = this.f9415s;
        if (c1880g != null) {
            return (long) c1880g.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.e.c.f;
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.e.j;
    }

    public float getMaxFrame() {
        return this.e.c.b();
    }

    public float getMinFrame() {
        return this.e.c.c();
    }

    @Nullable
    public z getPerformanceTracker() {
        C1880g c1880g = this.e.f18489b;
        if (c1880g != null) {
            return c1880g.f18459a;
        }
        return null;
    }

    @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d)
    public float getProgress() {
        return this.e.c.a();
    }

    public int getRepeatCount() {
        return this.e.c.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.e.c.getRepeatMode();
    }

    public float getScale() {
        return this.e.f18490d;
    }

    public float getSpeed() {
        return this.e.c.c;
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        s sVar = this.e;
        if (drawable2 == sVar) {
            super.invalidateDrawable(sVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        if (this.m || this.f9408k) {
            d();
            this.m = false;
            this.f9408k = false;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        if (this.e.f()) {
            a();
            this.f9408k = true;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        String str = savedState.f9416a;
        this.f9407g = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.f9407g);
        }
        int i = savedState.f9417b;
        this.h = i;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(savedState.c);
        if (savedState.f9418d) {
            d();
        }
        this.e.j = savedState.e;
        setRepeatMode(savedState.f);
        setRepeatCount(savedState.f9419g);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f9416a = this.f9407g;
        savedState.f9417b = this.h;
        s sVar = this.e;
        savedState.c = sVar.c.a();
        savedState.f9418d = sVar.f() || (!ViewCompat.isAttachedToWindow(this) && this.f9408k);
        savedState.e = sVar.j;
        ChoreographerFrameCallbackC2541c choreographerFrameCallbackC2541c = sVar.c;
        savedState.f = choreographerFrameCallbackC2541c.getRepeatMode();
        savedState.f9419g = choreographerFrameCallbackC2541c.getRepeatCount();
        return savedState;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        if (this.f) {
            boolean zIsShown = isShown();
            s sVar = this.e;
            if (zIsShown) {
                if (this.j) {
                    if (isShown()) {
                        sVar.h();
                        c();
                    } else {
                        this.i = false;
                        this.j = true;
                    }
                } else if (this.i) {
                    d();
                }
                this.j = false;
                this.i = false;
                return;
            }
            if (sVar.f()) {
                this.m = false;
                this.f9408k = false;
                this.j = false;
                this.i = false;
                sVar.h.clear();
                sVar.c.g(true);
                c();
                this.j = true;
            }
        }
    }

    public void setAnimation(@RawRes int i) {
        y yVarA;
        this.h = i;
        this.f9407g = null;
        if (isInEditMode()) {
            yVarA = new y(new CallableC1879f(this, i, 0), true);
        } else if (this.f9410n) {
            Context context = getContext();
            String strH = AbstractC1883j.h(context, i);
            yVarA = AbstractC1883j.a(strH, new d(new WeakReference(context), context.getApplicationContext(), i, strH));
        } else {
            Context context2 = getContext();
            HashMap map = AbstractC1883j.f18472a;
            yVarA = AbstractC1883j.a(null, new d(new WeakReference(context2), context2.getApplicationContext(), i, (String) null));
        }
        setCompositionTask(yVarA);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setCompositionTask(AbstractC1883j.a(null, new CallableC0192z(new ByteArrayInputStream(str.getBytes()), 6)));
    }

    public void setAnimationFromUrl(String str) {
        y yVarA;
        int i = 0;
        if (this.f9410n) {
            Context context = getContext();
            HashMap map = AbstractC1883j.f18472a;
            String strH = AbstractC1414e.h("url_", str);
            yVarA = AbstractC1883j.a(strH, new CallableC1882i(context, i, str, strH));
        } else {
            yVarA = AbstractC1883j.a(null, new CallableC1882i(getContext(), i, str, null));
        }
        setCompositionTask(yVarA);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z4) {
        this.e.f18497q = z4;
    }

    public void setCacheComposition(boolean z4) {
        this.f9410n = z4;
    }

    public void setComposition(@NonNull C1880g c1880g) {
        s sVar = this.e;
        sVar.setCallback(this);
        this.f9415s = c1880g;
        boolean z4 = true;
        this.f9409l = true;
        if (sVar.f18489b == c1880g) {
            z4 = false;
        } else {
            sVar.f18499s = false;
            sVar.d();
            sVar.f18489b = c1880g;
            sVar.c();
            ChoreographerFrameCallbackC2541c choreographerFrameCallbackC2541c = sVar.c;
            boolean z5 = choreographerFrameCallbackC2541c.j == null;
            choreographerFrameCallbackC2541c.j = c1880g;
            if (z5) {
                choreographerFrameCallbackC2541c.i((int) Math.max(choreographerFrameCallbackC2541c.h, c1880g.f18463k), (int) Math.min(choreographerFrameCallbackC2541c.i, c1880g.f18464l));
            } else {
                choreographerFrameCallbackC2541c.i((int) c1880g.f18463k, (int) c1880g.f18464l);
            }
            float f = choreographerFrameCallbackC2541c.f;
            choreographerFrameCallbackC2541c.f = 0.0f;
            choreographerFrameCallbackC2541c.h((int) f);
            choreographerFrameCallbackC2541c.f();
            sVar.o(choreographerFrameCallbackC2541c.getAnimatedFraction());
            sVar.f18490d = sVar.f18490d;
            ArrayList arrayList = sVar.h;
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                r rVar = (r) it.next();
                if (rVar != null) {
                    rVar.run();
                }
                it.remove();
            }
            arrayList.clear();
            c1880g.f18459a.f18537a = sVar.f18495o;
            Drawable.Callback callback = sVar.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(sVar);
            }
        }
        this.f9409l = false;
        c();
        if (getDrawable() != sVar || z4) {
            if (!z4) {
                boolean zF = sVar.f();
                setImageDrawable(null);
                setImageDrawable(sVar);
                if (zF) {
                    sVar.h();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it2 = this.f9412p.iterator();
            if (it2.hasNext()) {
                throw AbstractC1331a.n(it2);
            }
        }
    }

    public void setFailureListener(@Nullable u uVar) {
        this.c = uVar;
    }

    public void setFallbackResource(@DrawableRes int i) {
        this.f9406d = i;
    }

    public void setFontAssetDelegate(AbstractC1874a abstractC1874a) {
        b bVar = this.e.f18492k;
    }

    public void setFrame(int i) {
        this.e.i(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z4) {
        this.e.f = z4;
    }

    public void setImageAssetDelegate(InterfaceC1875b interfaceC1875b) {
        C2179a c2179a = this.e.i;
    }

    public void setImageAssetsFolder(String str) {
        this.e.j = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        b();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        b();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        b();
        super.setImageResource(i);
    }

    public void setMaxFrame(int i) {
        this.e.j(i);
    }

    public void setMaxProgress(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        s sVar = this.e;
        C1880g c1880g = sVar.f18489b;
        if (c1880g == null) {
            sVar.h.add(new C1887n(sVar, f, 2));
        } else {
            sVar.j((int) AbstractC2543e.d(c1880g.f18463k, c1880g.f18464l, f));
        }
    }

    public void setMinAndMaxFrame(String str) {
        this.e.l(str);
    }

    public void setMinFrame(int i) {
        this.e.m(i);
    }

    public void setMinProgress(float f) {
        s sVar = this.e;
        C1880g c1880g = sVar.f18489b;
        if (c1880g == null) {
            sVar.h.add(new C1887n(sVar, f, 1));
        } else {
            sVar.m((int) AbstractC2543e.d(c1880g.f18463k, c1880g.f18464l, f));
        }
    }

    public void setOutlineMasksAndMattes(boolean z4) {
        s sVar = this.e;
        if (sVar.f18496p == z4) {
            return;
        }
        sVar.f18496p = z4;
        C2328c c2328c = sVar.m;
        if (c2328c != null) {
            c2328c.q(z4);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z4) {
        s sVar = this.e;
        sVar.f18495o = z4;
        C1880g c1880g = sVar.f18489b;
        if (c1880g != null) {
            c1880g.f18459a.f18537a = z4;
        }
    }

    public void setProgress(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        this.e.o(f);
    }

    public void setRenderMode(EnumC1871B enumC1871B) {
        this.f9411o = enumC1871B;
        c();
    }

    public void setRepeatCount(int i) {
        this.e.c.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.e.c.setRepeatMode(i);
    }

    public void setSafeMode(boolean z4) {
        this.e.f18491g = z4;
    }

    public void setScale(float f) {
        s sVar = this.e;
        sVar.f18490d = f;
        if (getDrawable() == sVar) {
            boolean zF = sVar.f();
            setImageDrawable(null);
            setImageDrawable(sVar);
            if (zF) {
                sVar.h();
            }
        }
    }

    public void setSpeed(float f) {
        this.e.c.c = f;
    }

    public void setTextDelegate(AbstractC1873D abstractC1873D) {
        this.e.getClass();
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        s sVar;
        if (!this.f9409l && drawable == (sVar = this.e) && sVar.f()) {
            this.m = false;
            this.f9408k = false;
            this.j = false;
            this.i = false;
            sVar.h.clear();
            sVar.c.g(true);
            c();
        } else if (!this.f9409l && (drawable instanceof s)) {
            s sVar2 = (s) drawable;
            if (sVar2.f()) {
                sVar2.h.clear();
                sVar2.c.g(true);
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.e.k(str);
    }

    public void setMinFrame(String str) {
        this.e.n(str);
    }

    public void setAnimation(String str) {
        y yVarA;
        int i = 1;
        this.f9407g = str;
        this.h = 0;
        if (isInEditMode()) {
            yVarA = new y(new n(8, this, str), true);
        } else if (this.f9410n) {
            Context context = getContext();
            HashMap map = AbstractC1883j.f18472a;
            String strH = AbstractC1414e.h("asset_", str);
            yVarA = AbstractC1883j.a(strH, new CallableC1882i(context.getApplicationContext(), i, str, strH));
        } else {
            Context context2 = getContext();
            HashMap map2 = AbstractC1883j.f18472a;
            yVarA = AbstractC1883j.a(null, new CallableC1882i(context2.getApplicationContext(), i, str, null));
        }
        setCompositionTask(yVarA);
    }
}
