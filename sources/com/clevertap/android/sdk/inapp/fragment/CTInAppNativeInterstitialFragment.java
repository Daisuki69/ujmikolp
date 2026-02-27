package com.clevertap.android.sdk.inapp.fragment;

import D.S;
import M8.D2;
import S.f;
import S.g;
import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentDialog;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.common.util.UnstableApi;
import cj.C1110A;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.gif.GifImageView;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import dOYHB6.lN8Dz0.yf3D09;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import q0.InterfaceC2158a;
import q0.c;
import q0.d;
import r0.a;
import r0.b;
import zj.C2576A;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class CTInAppNativeInterstitialFragment extends CTInAppBaseFullNativeFragment {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f9531T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ComponentDialog f9532U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public ImageView f9533V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public GifImageView f9534W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public InterfaceC2158a f9535X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public RelativeLayout f9536Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public FrameLayout f9537Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public FrameLayout f9538a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ViewGroup.LayoutParams f9539b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final D2 f9540c0 = new D2(this);

    public static final void I1(CTInAppNativeInterstitialFragment this$0) {
        j.g(this$0, "this$0");
        boolean z4 = this$0.f9531T;
        D2 d22 = this$0.f9540c0;
        if (z4) {
            this$0.G1();
            d22.setEnabled(false);
            return;
        }
        d22.setEnabled(true);
        InterfaceC2158a interfaceC2158a = this$0.f9535X;
        if (interfaceC2158a == null) {
            j.n("handle");
            throw null;
        }
        View viewA = interfaceC2158a.a();
        ImageView imageView = this$0.f9533V;
        this$0.f9539b0 = imageView != null ? imageView.getLayoutParams() : null;
        InterfaceC2158a interfaceC2158a2 = this$0.f9535X;
        if (interfaceC2158a2 == null) {
            j.n("handle");
            throw null;
        }
        interfaceC2158a2.d(true);
        FrameLayout frameLayout = this$0.f9537Z;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        if (this$0.f9532U == null) {
            Context contextRequireContext = this$0.requireContext();
            j.f(contextRequireContext, "requireContext(...)");
            ComponentDialog componentDialog = new ComponentDialog(contextRequireContext, R.style.Theme.Black.NoTitleBar.Fullscreen);
            this$0.f9532U = componentDialog;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            yf3D09 yf3d09 = new yf3D09(this$0.requireContext());
            this$0.f9538a0 = yf3d09;
            componentDialog.addContentView(yf3d09, layoutParams);
            FragmentActivity activity = this$0.getActivity();
            if (activity != null) {
                componentDialog.getOnBackPressedDispatcher().addCallback(activity, d22);
            }
        }
        FrameLayout frameLayout2 = this$0.f9538a0;
        if (frameLayout2 != null) {
            frameLayout2.addView(viewA);
        }
        this$0.f9531T = true;
        ComponentDialog componentDialog2 = this$0.f9532U;
        if (componentDialog2 != null) {
            componentDialog2.show();
        }
    }

    public final void G1() {
        InterfaceC2158a interfaceC2158a = this.f9535X;
        if (interfaceC2158a == null) {
            j.n("handle");
            throw null;
        }
        View viewA = interfaceC2158a.a();
        InterfaceC2158a interfaceC2158a2 = this.f9535X;
        if (interfaceC2158a2 == null) {
            j.n("handle");
            throw null;
        }
        interfaceC2158a2.d(false);
        ImageView imageView = this.f9533V;
        if (imageView != null) {
            imageView.setLayoutParams(this.f9539b0);
        }
        FrameLayout frameLayout = this.f9538a0;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        FrameLayout frameLayout2 = this.f9537Z;
        if (frameLayout2 != null) {
            frameLayout2.addView(viewA);
        }
        FrameLayout frameLayout3 = this.f9537Z;
        if (frameLayout3 != null) {
            frameLayout3.addView(this.f9533V);
        }
        this.f9531T = false;
        ComponentDialog componentDialog = this.f9532U;
        if (componentDialog != null) {
            componentDialog.dismiss();
        }
        ImageView imageView2 = this.f9533V;
        if (imageView2 != null) {
            imageView2.setImageDrawable(ContextCompat.getDrawable(requireContext(), com.paymaya.R.drawable.ct_ic_fullscreen_expand));
        }
    }

    public final void H1() {
        ImageView imageView = new ImageView(requireContext());
        this.f9533V = imageView;
        imageView.setImageDrawable(ResourcesCompat.getDrawable(getResources(), com.paymaya.R.drawable.ct_ic_fullscreen_expand, null));
        imageView.setOnClickListener(new f(this, 0));
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iApplyDimension = (int) ((p1().f9481U && w1()) ? TypedValue.applyDimension(1, 30.0f, displayMetrics) : TypedValue.applyDimension(1, 20.0f, displayMetrics));
        int iApplyDimension2 = (int) TypedValue.applyDimension(1, 4.0f, displayMetrics);
        int iApplyDimension3 = (int) TypedValue.applyDimension(1, 2.0f, displayMetrics);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iApplyDimension, iApplyDimension);
        layoutParams.gravity = 8388613;
        layoutParams.setMargins(0, iApplyDimension2, iApplyDimension3, 0);
        imageView.setLayoutParams(layoutParams);
    }

    public final void J1() {
        InterfaceC2158a interfaceC2158a = this.f9535X;
        if (interfaceC2158a == null) {
            j.n("handle");
            throw null;
        }
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        interfaceC2158a.e(contextRequireContext, p1().f9481U && w1());
        FrameLayout frameLayout = this.f9537Z;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        InterfaceC2158a interfaceC2158a2 = this.f9535X;
        if (interfaceC2158a2 == null) {
            j.n("handle");
            throw null;
        }
        View viewA = interfaceC2158a2.a();
        FrameLayout frameLayout2 = this.f9537Z;
        if (frameLayout2 == null || frameLayout2.getChildCount() != 0) {
            S.b("Video views and controls are already added, not re-attaching");
        } else {
            FrameLayout frameLayout3 = this.f9537Z;
            if (frameLayout3 != null) {
                frameLayout3.addView(viewA);
            }
            FrameLayout frameLayout4 = this.f9537Z;
            if (frameLayout4 != null) {
                frameLayout4.addView(this.f9533V);
            }
        }
        InterfaceC2158a interfaceC2158a3 = this.f9535X;
        if (interfaceC2158a3 == null) {
            j.n("handle");
            throw null;
        }
        Context contextRequireContext2 = requireContext();
        j.f(contextRequireContext2, "requireContext(...)");
        interfaceC2158a3.c(contextRequireContext2, ((CTInAppNotificationMedia) p1().f9483W.get(0)).f9512a);
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFullFragment, com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment
    public final void l1() {
        GifImageView gifImageView = this.f9534W;
        if (gifImageView != null) {
            gifImageView.a();
        }
        InterfaceC2158a interfaceC2158a = this.f9535X;
        if (interfaceC2158a != null) {
            interfaceC2158a.pause();
        } else {
            j.n("handle");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        InterfaceC2158a interfaceC2158a;
        super.onCreate(bundle);
        if (c.c == d.f19738b) {
            b bVar = new b();
            bVar.f19830d = new FrameLayout.LayoutParams(-1, -1);
            interfaceC2158a = bVar;
        } else {
            a aVar = new a();
            aVar.f19827d = new FrameLayout.LayoutParams(-1, -1);
            interfaceC2158a = aVar;
        }
        this.f9535X = interfaceC2158a;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        ViewTreeObserver viewTreeObserver;
        RelativeLayout relativeLayout;
        ViewTreeObserver viewTreeObserver2;
        j.g(inflater, "inflater");
        View viewInflate = (p1().f9481U && w1()) ? inflater.inflate(com.paymaya.R.layout.tab_inapp_interstitial, viewGroup, false) : inflater.inflate(com.paymaya.R.layout.inapp_interstitial, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(com.paymaya.R.id.inapp_interstitial_frame_layout);
        this.f9521Q = (CloseImageView) frameLayout.findViewById(199272);
        RelativeLayout relativeLayout2 = (RelativeLayout) frameLayout.findViewById(com.paymaya.R.id.interstitial_relative_layout);
        this.f9536Y = relativeLayout2;
        this.f9537Z = relativeLayout2 != null ? (FrameLayout) relativeLayout2.findViewById(com.paymaya.R.id.video_frame) : null;
        RelativeLayout relativeLayout3 = this.f9536Y;
        if (relativeLayout3 != null) {
            relativeLayout3.setBackgroundColor(Color.parseColor(p1().f9505v));
        }
        frameLayout.setBackground(new ColorDrawable(-1157627904));
        CloseImageView closeImageView = this.f9521Q;
        j.d(closeImageView);
        int i = this.f9520P;
        if (i == 1) {
            RelativeLayout relativeLayout4 = this.f9536Y;
            if (relativeLayout4 != null && (viewTreeObserver = relativeLayout4.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new g(this, frameLayout, closeImageView, 0));
            }
        } else if (i == 2 && (relativeLayout = this.f9536Y) != null && (viewTreeObserver2 = relativeLayout.getViewTreeObserver()) != null) {
            viewTreeObserver2.addOnGlobalLayoutListener(new g(this, frameLayout, closeImageView, 1));
        }
        if (!p1().f9483W.isEmpty()) {
            CTInAppNotificationMedia cTInAppNotificationMedia = (CTInAppNotificationMedia) p1().f9483W.get(0);
            boolean zC = cTInAppNotificationMedia.c();
            String str = cTInAppNotificationMedia.c;
            if (zC) {
                Bitmap bitmapA = t1().a(cTInAppNotificationMedia.f9512a);
                if (bitmapA != null) {
                    RelativeLayout relativeLayout5 = this.f9536Y;
                    ImageView imageView = relativeLayout5 != null ? (ImageView) relativeLayout5.findViewById(com.paymaya.R.id.backgroundImage) : null;
                    if (imageView != null && !C2576A.H(str)) {
                        imageView.setContentDescription(str);
                    }
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    if (imageView != null) {
                        imageView.setImageBitmap(bitmapA);
                    }
                }
            } else if (cTInAppNotificationMedia.b()) {
                byte[] bArr = (byte[]) t1().b(new Pair(cTInAppNotificationMedia.f9512a, Q.a.f5195b), V.g.f6023d);
                if (bArr != null) {
                    RelativeLayout relativeLayout6 = this.f9536Y;
                    GifImageView gifImageView = relativeLayout6 != null ? (GifImageView) relativeLayout6.findViewById(com.paymaya.R.id.gifImage) : null;
                    this.f9534W = gifImageView;
                    if (gifImageView != null && !C2576A.H(str)) {
                        gifImageView.setContentDescription(str);
                    }
                    GifImageView gifImageView2 = this.f9534W;
                    if (gifImageView2 != null) {
                        gifImageView2.setVisibility(0);
                    }
                    GifImageView gifImageView3 = this.f9534W;
                    if (gifImageView3 != null) {
                        gifImageView3.setBytes(bArr);
                    }
                    GifImageView gifImageView4 = this.f9534W;
                    if (gifImageView4 != null) {
                        gifImageView4.f9467a = true;
                        gifImageView4.b();
                    }
                }
            } else if (cTInAppNotificationMedia.d()) {
                H1();
                J1();
                InterfaceC2158a interfaceC2158a = this.f9535X;
                if (interfaceC2158a == null) {
                    j.n("handle");
                    throw null;
                }
                interfaceC2158a.play();
                FrameLayout frameLayout2 = this.f9537Z;
                if (frameLayout2 != null && !C2576A.H(str)) {
                    frameLayout2.setContentDescription(str);
                }
            } else if (cTInAppNotificationMedia.a()) {
                H1();
                J1();
                InterfaceC2158a interfaceC2158a2 = this.f9535X;
                if (interfaceC2158a2 == null) {
                    j.n("handle");
                    throw null;
                }
                interfaceC2158a2.play();
                ImageView imageView2 = this.f9533V;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
                FrameLayout frameLayout3 = this.f9537Z;
                if (frameLayout3 != null && !C2576A.H(str)) {
                    frameLayout3.setContentDescription(str);
                }
            }
        }
        RelativeLayout relativeLayout7 = this.f9536Y;
        TextView textView = relativeLayout7 != null ? (TextView) relativeLayout7.findViewById(com.paymaya.R.id.interstitial_title) : null;
        if (textView != null) {
            textView.setText(p1().f9496l);
        }
        if (textView != null) {
            textView.setTextColor(Color.parseColor(p1().f9488a0));
        }
        RelativeLayout relativeLayout8 = this.f9536Y;
        TextView textView2 = relativeLayout8 != null ? (TextView) relativeLayout8.findViewById(com.paymaya.R.id.interstitial_message) : null;
        if (textView2 != null) {
            textView2.setText(p1().m);
        }
        if (textView2 != null) {
            textView2.setTextColor(Color.parseColor(p1().f9484X));
        }
        ArrayList arrayList = new ArrayList();
        RelativeLayout relativeLayout9 = this.f9536Y;
        LinearLayout linearLayout = relativeLayout9 != null ? (LinearLayout) relativeLayout9.findViewById(com.paymaya.R.id.interstitial_linear_layout) : null;
        Button button = linearLayout != null ? (Button) linearLayout.findViewById(com.paymaya.R.id.interstitial_button1) : null;
        if (button != null) {
            arrayList.add(button);
        }
        Button button2 = linearLayout != null ? (Button) linearLayout.findViewById(com.paymaya.R.id.interstitial_button2) : null;
        if (button2 != null) {
            arrayList.add(button2);
        }
        ArrayList arrayList2 = p1().i;
        if (arrayList2.size() == 1) {
            int i4 = this.f9520P;
            if (i4 == 2) {
                if (button != null) {
                    button.setVisibility(8);
                }
            } else if (i4 == 1 && button != null) {
                button.setVisibility(4);
            }
            if (button2 != null) {
                F1(button2, (CTInAppNotificationButton) arrayList2.get(0), 0);
            }
        } else if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i6 = 0; i6 < size && i6 < 2; i6++) {
                F1((Button) arrayList.get(i6), (CTInAppNotificationButton) arrayList2.get(i6), i6);
            }
        }
        if (p1().f9479S) {
            CloseImageView closeImageView2 = this.f9521Q;
            if (closeImageView2 != null) {
                closeImageView2.setVisibility(0);
            }
            CloseImageView closeImageView3 = this.f9521Q;
            if (closeImageView3 != null) {
                closeImageView3.setOnClickListener(new f(this, 1));
            }
        } else {
            CloseImageView closeImageView4 = this.f9521Q;
            if (closeImageView4 != null) {
                closeImageView4.setOnClickListener(null);
            }
            CloseImageView closeImageView5 = this.f9521Q;
            if (closeImageView5 != null) {
                closeImageView5.setVisibility(8);
                return viewInflate;
            }
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        GifImageView gifImageView = this.f9534W;
        if (gifImageView != null) {
            gifImageView.a();
        }
        if (this.f9531T) {
            G1();
            this.f9540c0.setEnabled(false);
        }
        InterfaceC2158a interfaceC2158a = this.f9535X;
        if (interfaceC2158a == null) {
            j.n("handle");
            throw null;
        }
        interfaceC2158a.b();
        InterfaceC2158a interfaceC2158a2 = this.f9535X;
        if (interfaceC2158a2 != null) {
            interfaceC2158a2.pause();
        } else {
            j.n("handle");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ArrayList arrayList = p1().f9483W;
        if (arrayList.isEmpty()) {
            return;
        }
        CTInAppNotificationMedia cTInAppNotificationMedia = (CTInAppNotificationMedia) arrayList.get(0);
        if (cTInAppNotificationMedia.d() || cTInAppNotificationMedia.a()) {
            J1();
            InterfaceC2158a interfaceC2158a = this.f9535X;
            if (interfaceC2158a != null) {
                interfaceC2158a.play();
            } else {
                j.n("handle");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        CTInAppNotificationMedia cTInAppNotificationMedia;
        super.onStart();
        GifImageView gifImageView = this.f9534W;
        if (gifImageView == null || (cTInAppNotificationMedia = (CTInAppNotificationMedia) C1110A.B(p1().f9483W)) == null) {
            return;
        }
        gifImageView.setBytes((byte[]) t1().b(new Pair(cTInAppNotificationMedia.f9512a, Q.a.f5195b), V.g.f6023d));
        gifImageView.f9467a = true;
        gifImageView.b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        GifImageView gifImageView = this.f9534W;
        if (gifImageView != null) {
            gifImageView.a();
        }
        InterfaceC2158a interfaceC2158a = this.f9535X;
        if (interfaceC2158a != null) {
            interfaceC2158a.pause();
        } else {
            j.n("handle");
            throw null;
        }
    }
}
