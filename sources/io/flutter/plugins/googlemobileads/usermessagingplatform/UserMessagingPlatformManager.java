package io.flutter.plugins.googlemobileads.usermessagingplatform;

import L1.b;
import L1.c;
import L1.d;
import L1.e;
import L1.f;
import L1.g;
import L1.h;
import L1.i;
import L1.k;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.consent_sdk.zza;
import com.google.android.gms.internal.consent_sdk.zzbo;
import com.google.android.gms.internal.consent_sdk.zzcs;
import com.google.android.gms.internal.consent_sdk.zzj;
import pg.E;
import pg.j;
import pg.r;
import pg.s;
import pg.t;
import pg.u;

/* JADX INFO: loaded from: classes4.dex */
public class UserMessagingPlatformManager implements s {
    private static final String INTERNAL_ERROR_CODE = "0";
    private static final String METHOD_CHANNEL_NAME = "plugins.flutter.io/google_mobile_ads/ump";

    @Nullable
    private Activity activity;

    @Nullable
    private g consentInformation;
    private final Context context;
    private final u methodChannel;
    private final UserMessagingCodec userMessagingCodec;

    /* JADX INFO: renamed from: io.flutter.plugins.googlemobileads.usermessagingplatform.UserMessagingPlatformManager$6, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$ump$ConsentInformation$PrivacyOptionsRequirementStatus;

        static {
            int[] iArr = new int[f.values().length];
            $SwitchMap$com$google$android$ump$ConsentInformation$PrivacyOptionsRequirementStatus = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$android$ump$ConsentInformation$PrivacyOptionsRequirementStatus[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public UserMessagingPlatformManager(j jVar, Context context) {
        UserMessagingCodec userMessagingCodec = new UserMessagingCodec();
        this.userMessagingCodec = userMessagingCodec;
        u uVar = new u(jVar, METHOD_CHANNEL_NAME, new E(userMessagingCodec), null);
        this.methodChannel = uVar;
        uVar.b(this);
        this.context = context;
    }

    private g getConsentInformation() {
        g gVar = this.consentInformation;
        if (gVar != null) {
            return gVar;
        }
        zzj zzjVarZzb = zza.zza(this.context).zzb();
        this.consentInformation = zzjVarZzb;
        return zzjVarZzb;
    }

    @Override // pg.s
    public void onMethodCall(@NonNull r rVar, @NonNull final t tVar) {
        final int i;
        final int i4;
        i = 1;
        i4 = 0;
        String str = rVar.f19112a;
        str.getClass();
        switch (str) {
            case "ConsentInformation#reset":
                getConsentInformation().reset();
                tVar.success(null);
                break;
            case "UserMessagingPlatform#loadAndShowConsentFormIfRequired":
                final Activity activity = this.activity;
                if (activity == null) {
                    tVar.error("0", "UserMessagingPlatform#loadAndShowConsentFormIfRequired called before plugin has been registered to an activity.", null);
                    break;
                } else {
                    final b bVar = new b() { // from class: io.flutter.plugins.googlemobileads.usermessagingplatform.a
                        @Override // L1.b
                        public final void onConsentFormDismissed(i iVar) {
                            switch (i4) {
                                case 0:
                                    tVar.success(iVar);
                                    break;
                                default:
                                    tVar.success(iVar);
                                    break;
                            }
                        }
                    };
                    if (!zza.zza(activity).zzb().canRequestAds()) {
                        zzbo zzboVarZzc = zza.zza(activity).zzc();
                        zzcs.zza();
                        zzboVarZzc.zzb(new k() { // from class: com.google.android.gms.internal.consent_sdk.zzbm
                            @Override // L1.k
                            public final void onConsentFormLoadSuccess(c cVar) {
                                cVar.show(activity, bVar);
                            }
                        }, new L1.j() { // from class: com.google.android.gms.internal.consent_sdk.zzbn
                            @Override // L1.j
                            public final void onConsentFormLoadFailure(i iVar) {
                                bVar.onConsentFormDismissed(iVar);
                            }
                        });
                    } else {
                        bVar.onConsentFormDismissed(null);
                    }
                    break;
                }
                break;
            case "ConsentInformation#requestConsentInfoUpdate":
                if (this.activity == null) {
                    tVar.error("0", "ConsentInformation#requestConsentInfoUpdate called before plugin has been registered to an activity.", null);
                    break;
                } else {
                    ConsentRequestParametersWrapper consentRequestParametersWrapper = (ConsentRequestParametersWrapper) rVar.a("params");
                    getConsentInformation().requestConsentInfoUpdate(this.activity, consentRequestParametersWrapper == null ? new h(new A3.i()) : consentRequestParametersWrapper.getAsConsentRequestParameters(this.activity), new e() { // from class: io.flutter.plugins.googlemobileads.usermessagingplatform.UserMessagingPlatformManager.1
                        @Override // L1.e
                        public void onConsentInfoUpdateSuccess() {
                            tVar.success(null);
                        }
                    }, new d() { // from class: io.flutter.plugins.googlemobileads.usermessagingplatform.UserMessagingPlatformManager.2
                        @Override // L1.d
                        public void onConsentInfoUpdateFailure(i iVar) {
                            tVar.error(Integer.toString(iVar.f2805a), iVar.f2806b, null);
                        }
                    });
                    break;
                }
                break;
            case "ConsentForm#show":
                c cVar = (c) rVar.a("consentForm");
                if (cVar == null) {
                    tVar.error("0", "ConsentForm#show", null);
                    break;
                } else {
                    cVar.show(this.activity, new b() { // from class: io.flutter.plugins.googlemobileads.usermessagingplatform.UserMessagingPlatformManager.5
                        @Override // L1.b
                        public void onConsentFormDismissed(@Nullable i iVar) {
                            if (iVar != null) {
                                tVar.error(Integer.toString(iVar.f2805a), iVar.f2806b, null);
                            } else {
                                tVar.success(null);
                            }
                        }
                    });
                    break;
                }
                break;
            case "ConsentForm#dispose":
                c cVar2 = (c) rVar.a("consentForm");
                if (cVar2 == null) {
                    Log.w("0", "Called dispose on ad that has been freed");
                } else {
                    this.userMessagingCodec.disposeConsentForm(cVar2);
                }
                tVar.success(null);
                break;
            case "UserMessagingPlatform#showPrivacyOptionsForm":
                Activity activity2 = this.activity;
                if (activity2 == null) {
                    tVar.error("0", "UserMessagingPlatform#showPrivacyOptionsForm called before plugin has been registered to an activity.", null);
                    break;
                } else {
                    zza.zza(activity2).zzc().zze(activity2, new b() { // from class: io.flutter.plugins.googlemobileads.usermessagingplatform.a
                        @Override // L1.b
                        public final void onConsentFormDismissed(i iVar) {
                            switch (i) {
                                case 0:
                                    tVar.success(iVar);
                                    break;
                                default:
                                    tVar.success(iVar);
                                    break;
                            }
                        }
                    });
                    break;
                }
                break;
            case "ConsentInformation#isConsentFormAvailable":
                tVar.success(Boolean.valueOf(getConsentInformation().isConsentFormAvailable()));
                break;
            case "UserMessagingPlatform#loadConsentForm":
                zza.zza(this.context).zzc().zzb(new k() { // from class: io.flutter.plugins.googlemobileads.usermessagingplatform.UserMessagingPlatformManager.3
                    @Override // L1.k
                    public void onConsentFormLoadSuccess(c cVar3) {
                        UserMessagingPlatformManager.this.userMessagingCodec.trackConsentForm(cVar3);
                        tVar.success(cVar3);
                    }
                }, new L1.j() { // from class: io.flutter.plugins.googlemobileads.usermessagingplatform.UserMessagingPlatformManager.4
                    @Override // L1.j
                    public void onConsentFormLoadFailure(i iVar) {
                        tVar.error(Integer.toString(iVar.f2805a), iVar.f2806b, null);
                    }
                });
                break;
            case "ConsentInformation#getPrivacyOptionsRequirementStatus":
                int iOrdinal = getConsentInformation().getPrivacyOptionsRequirementStatus().ordinal();
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        tVar.success(1);
                    } else {
                        tVar.success(2);
                    }
                    break;
                } else {
                    tVar.success(0);
                    break;
                }
                break;
            case "ConsentInformation#canRequestAds":
                tVar.success(Boolean.valueOf(getConsentInformation().canRequestAds()));
                break;
            case "ConsentInformation#getConsentStatus":
                tVar.success(Integer.valueOf(getConsentInformation().getConsentStatus()));
                break;
            default:
                tVar.notImplemented();
                break;
        }
    }

    public void setActivity(@Nullable Activity activity) {
        this.activity = activity;
    }

    @VisibleForTesting
    public UserMessagingPlatformManager(j jVar, Context context, UserMessagingCodec userMessagingCodec) {
        this.userMessagingCodec = userMessagingCodec;
        u uVar = new u(jVar, METHOD_CHANNEL_NAME, new E(userMessagingCodec), null);
        this.methodChannel = uVar;
        uVar.b(this);
        this.context = context;
    }
}
