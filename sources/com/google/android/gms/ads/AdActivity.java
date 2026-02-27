package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbsw;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public final class AdActivity extends Activity {

    @NonNull
    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";

    @Nullable
    private zzbsw zza;

    private final void zza() {
        zzbsw zzbswVar = this.zza;
        if (zzbswVar != null) {
            try {
                zzbswVar.zzs();
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i4, @NonNull Intent intent) {
        try {
            zzbsw zzbswVar = this.zza;
            if (zzbswVar != null) {
                zzbswVar.zzm(i, i4, intent);
            }
        } catch (Exception e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i4, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zzbsw zzbswVar = this.zza;
            if (zzbswVar != null) {
                if (!zzbswVar.zzg()) {
                    return;
                }
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            zzbsw zzbswVar2 = this.zza;
            if (zzbswVar2 != null) {
                zzbswVar2.zze();
            }
        } catch (RemoteException e7) {
            zzo.zzl("#007 Could not call remote method.", e7);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbsw zzbswVar = this.zza;
            if (zzbswVar != null) {
                zzbswVar.zzn(ObjectWrapper.wrap(configuration));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        super.onCreate(bundle);
        zzo.zzd("AdActivity onCreate");
        zzbsw zzbswVarZzh = zzbb.zzb().zzh(this);
        this.zza = zzbswVarZzh;
        if (zzbswVarZzh == null) {
            zzo.zzl("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            zzbswVarZzh.zzh(bundle);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        zzo.zzd("AdActivity onDestroy");
        try {
            zzbsw zzbswVar = this.zza;
            if (zzbswVar != null) {
                zzbswVar.zzq();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        iKNpI8.jG8Sm1(this);
        zzo.zzd("AdActivity onPause");
        try {
            zzbsw zzbswVar = this.zza;
            if (zzbswVar != null) {
                zzbswVar.zzl();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        try {
            zzbsw zzbswVar = this.zza;
            if (zzbswVar != null) {
                zzbswVar.zzH(i, strArr, iArr);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        zzo.zzd("AdActivity onRestart");
        try {
            zzbsw zzbswVar = this.zza;
            if (zzbswVar != null) {
                zzbswVar.zzi();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        iKNpI8.r8PTp0(this);
        zzo.zzd("AdActivity onResume");
        super.onResume();
        try {
            zzbsw zzbswVar = this.zza;
            if (zzbswVar != null) {
                zzbswVar.zzk();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        try {
            zzbsw zzbswVar = this.zza;
            if (zzbswVar != null) {
                zzbswVar.zzo(bundle);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        iKNpI8.pX3PN6(this);
        super.onStart();
        zzo.zzd("AdActivity onStart");
        try {
            zzbsw zzbswVar = this.zza;
            if (zzbswVar != null) {
                zzbswVar.zzj();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        iKNpI8.xoZZl9(this);
        zzo.zzd("AdActivity onStop");
        try {
            zzbsw zzbswVar = this.zza;
            if (zzbswVar != null) {
                zzbswVar.zzp();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zZN5YC5 = hxOD26.zN5YC5(motionEvent);
        return !zZN5YC5 ? super.onTouchEvent(motionEvent) : zZN5YC5;
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        iKNpI8.fBndJ9(this);
        super.onUserInteraction();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbsw zzbswVar = this.zza;
            if (zzbswVar != null) {
                zzbswVar.zzf();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(@NonNull View view) {
        super.setContentView(view);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(@NonNull View view, @NonNull ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zza();
    }
}
