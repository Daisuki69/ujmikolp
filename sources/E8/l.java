package E8;

import M8.T2;
import af.C0690e;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.camera.camera2.interop.Camera2CameraControl;
import androidx.camera.core.impl.CameraStateRegistry;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource;
import androidx.media3.exoplayer.video.CompositingVideoSinkProvider;
import androidx.room.InvalidationTracker;
import androidx.webkit.WebViewCompat;
import androidx.window.area.WindowAreaControllerImpl;
import androidx.window.area.WindowAreaPresentationSessionCallback;
import androidx.window.area.WindowAreaSessionCallback;
import bf.C0951d;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.widget.ForcedAutoCompleteTextView;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaAutoCashinWalletSettingsFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaContactsSelectionFragment;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaServicesV2Fragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycWorkDetailsFragment;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsEnterCodeBottomSheetFragment;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyReceiptFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaAccountRecoveryEmailFragment;
import com.paymaya.mayaui.settings.view.fragment.impl.MayaChangeMinFormFragment;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1288b;

    public /* synthetic */ l(Object obj, int i) {
        this.f1287a = i;
        this.f1288b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f1288b;
        switch (this.f1287a) {
            case 0:
                final LinearLayout linearLayout = (LinearLayout) obj;
                linearLayout.setVisibility(0);
                Object parent = linearLayout.getParent();
                kotlin.jvm.internal.j.e(parent, "null cannot be cast to non-null type android.view.View");
                int width = ((View) parent).getWidth();
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int i = width - (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
                ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(i - (marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                final int measuredHeight = linearLayout.getMeasuredHeight();
                final ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
                layoutParams3.height = 0;
                linearLayout.setLayoutParams(layoutParams3);
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, measuredHeight);
                valueAnimatorOfInt.setDuration(200L);
                valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: E8.m
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator animator) {
                        kotlin.jvm.internal.j.g(animator, "animator");
                        Object animatedValue = animator.getAnimatedValue();
                        kotlin.jvm.internal.j.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                        int iIntValue = ((Integer) animatedValue).intValue();
                        ViewGroup.LayoutParams layoutParams4 = layoutParams3;
                        layoutParams4.height = iIntValue;
                        LinearLayout linearLayout2 = linearLayout;
                        linearLayout2.setLayoutParams(layoutParams4);
                        if (iIntValue == measuredHeight) {
                            layoutParams4.height = -2;
                            linearLayout2.setLayoutParams(layoutParams4);
                        }
                    }
                });
                valueAnimatorOfInt.start();
                return;
            case 1:
                ((ForcedAutoCompleteTextView) obj).showDropDown();
                return;
            case 2:
                MayaServicesV2Fragment mayaServicesV2Fragment = (MayaServicesV2Fragment) obj;
                int dimensionPixelSize = mayaServicesV2Fragment.getResources().getDimensionPixelSize(R.dimen.maya_margin_small);
                ConstraintLayout constraintLayout = mayaServicesV2Fragment.f12186a0;
                if (constraintLayout == null) {
                    kotlin.jvm.internal.j.n("mContainerMoreActions");
                    throw null;
                }
                int y7 = (int) (constraintLayout.getY() - dimensionPixelSize);
                NestedScrollView nestedScrollView = mayaServicesV2Fragment.f12183X;
                if (nestedScrollView != null) {
                    nestedScrollView.smoothScrollTo(0, y7);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mScrollViewContainer");
                    throw null;
                }
            case 3:
                MayaMissionsEnterCodeBottomSheetFragment mayaMissionsEnterCodeBottomSheetFragment = (MayaMissionsEnterCodeBottomSheetFragment) obj;
                Dialog dialog = mayaMissionsEnterCodeBottomSheetFragment.getDialog();
                kotlin.jvm.internal.j.e(dialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                View viewFindViewById = ((BottomSheetDialog) dialog).findViewById(R.id.design_bottom_sheet);
                if (viewFindViewById != null) {
                    BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewFindViewById);
                    ConstraintLayout constraintLayout2 = mayaMissionsEnterCodeBottomSheetFragment.f12992X;
                    if (constraintLayout2 != null) {
                        bottomSheetBehaviorFrom.setPeekHeight(constraintLayout2.getHeight(), true);
                        return;
                    } else {
                        kotlin.jvm.internal.j.n("mContainerConstraintLayout");
                        throw null;
                    }
                }
                return;
            case 4:
                ((MayaSendMoneyReceiptFragment) obj).p2();
                return;
            case 5:
                int i4 = MayaCashInActivity.f11609r;
                AbstractC1236z.g((MayaCashInActivity) obj, R.id.frame_layout_container, new MayaAutoCashinWalletSettingsFragment());
                return;
            case 6:
                ((Function0) obj).invoke();
                return;
            case 7:
                T2.N((MayaKycWorkDetailsFragment) obj, "DNFBP_Q", null, 13);
                return;
            case 8:
                MayaInputLayout mayaInputLayout = ((MayaAccountRecoveryEmailFragment) obj).f13911X;
                if (mayaInputLayout != null) {
                    mayaInputLayout.c();
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutRecoveryEmail");
                    throw null;
                }
            case 9:
                MayaInputLayout mayaInputLayout2 = ((MayaChangeMinFormFragment) obj).f13932V;
                if (mayaInputLayout2 != null) {
                    mayaInputLayout2.c();
                    return;
                } else {
                    kotlin.jvm.internal.j.n("mMayaInputLayoutNewMobileNumber");
                    throw null;
                }
            case 10:
                Y6.d dVar = ((MayaContactsSelectionFragment) obj).f11913v0;
                if (dVar != null) {
                    dVar.U();
                    return;
                }
                return;
            case 11:
                break;
            case 12:
                ((Camera2CameraControl) obj).completeInFlightUpdate();
                return;
            case 13:
                ((CameraStateRegistry.OnOpenAvailableListener) obj).onOpenAvailable();
                return;
            case 14:
                ((CameraStateRegistry.OnConfigureAvailableListener) obj).onConfigureAvailable();
                return;
            case 15:
                ((S1.y) obj).cancel(true);
                return;
            case 16:
                ((CallbackToFutureAdapter.Completer) obj).set(null);
                return;
            case 17:
                ((DualSurfaceProcessor) obj).lambda$release$4();
                return;
            case 18:
                ((DualSurfaceProcessorNode) obj).lambda$release$1();
                return;
            case 19:
                ProcessCameraProvider.shutdownAsync$lambda$0((ProcessCameraProvider) obj);
                return;
            case 20:
                ((AudioStream.AudioStreamCallback) obj).onSilenceStateChanged(true);
                return;
            case 21:
                ((Carousel) obj).lambda$updateItems$0();
                return;
            case 22:
                ((DefaultAnalyticsCollector) obj).releaseInternal();
                return;
            case 23:
                ((SsMediaSource) obj).startLoadingManifest();
                return;
            case 24:
                ((CompositingVideoSinkProvider) obj).flushInternal();
                return;
            case 25:
                ((InvalidationTracker) obj).onAutoCloseCallback();
                return;
            case 26:
                WebViewCompat.lambda$startUpWebView$2((WebViewCompat.WebViewStartUpCallback) obj);
                return;
            case 27:
                WindowAreaControllerImpl.presentContentOnWindowArea$lambda$2((WindowAreaPresentationSessionCallback) obj);
                return;
            case 28:
                WindowAreaControllerImpl.transferActivityToWindowArea$lambda$1((WindowAreaSessionCallback) obj);
                return;
            default:
                WindowAreaControllerImpl.RearDisplaySessionConsumer.onSessionFinished$lambda$2((WindowAreaControllerImpl.RearDisplaySessionConsumer) obj);
                return;
        }
        while (true) {
            C0690e c0690e = (C0690e) obj;
            ArrayList arrayList = c0690e.f;
            if (arrayList.isEmpty() || c0690e.f7148l != null) {
                return;
            }
            ((C0951d) arrayList.get(0)).f8647a.run();
            arrayList.remove(0);
        }
    }
}
