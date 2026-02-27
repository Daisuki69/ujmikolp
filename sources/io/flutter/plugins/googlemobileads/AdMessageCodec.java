package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.PlaybackException;
import androidx.work.WorkInfo;
import com.google.android.gms.ads.RequestConfiguration;
import io.flutter.plugins.googlemobileads.FlutterAd;
import io.flutter.plugins.googlemobileads.FlutterAdManagerAdRequest;
import io.flutter.plugins.googlemobileads.FlutterAdRequest;
import io.flutter.plugins.googlemobileads.FlutterAdSize;
import io.flutter.plugins.googlemobileads.FlutterAdapterStatus;
import io.flutter.plugins.googlemobileads.FlutterRewardedAd;
import io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateFontStyle;
import io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateStyle;
import io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateTextStyle;
import io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateType;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import pg.C2037D;

/* JADX INFO: loaded from: classes4.dex */
class AdMessageCodec extends C2037D {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final byte VALUE_ADAPTER_RESPONSE_INFO = -115;
    private static final byte VALUE_ADAPTER_STATUS = -120;
    private static final byte VALUE_ADMANAGER_AD_REQUEST = -122;
    private static final byte VALUE_AD_ERROR = -117;
    private static final byte VALUE_AD_REQUEST = -127;
    private static final byte VALUE_AD_SIZE = -128;
    private static final byte VALUE_ANCHORED_ADAPTIVE_BANNER_AD_SIZE = -114;
    private static final byte VALUE_COLOR = -103;
    private static final byte VALUE_FLUID_AD_SIZE = -126;
    private static final byte VALUE_INITIALIZATION_STATE = -121;
    private static final byte VALUE_INITIALIZATION_STATUS = -119;
    private static final byte VALUE_INLINE_ADAPTIVE_BANNER_AD_SIZE = -110;
    private static final byte VALUE_LOAD_AD_ERROR = -123;
    private static final byte VALUE_MEDIATION_EXTRAS = -102;
    private static final byte VALUE_NATIVE_AD_OPTIONS = -112;
    private static final byte VALUE_NATIVE_TEMPLATE_FONT_STYLE = -105;
    private static final byte VALUE_NATIVE_TEMPLATE_STYLE = -107;
    private static final byte VALUE_NATIVE_TEMPLATE_TEXT_STYLE = -106;
    private static final byte VALUE_NATIVE_TEMPLATE_TYPE = -104;
    private static final byte VALUE_REQUEST_CONFIGURATION_PARAMS = -108;
    private static final byte VALUE_RESPONSE_INFO = -116;
    private static final byte VALUE_REWARD_ITEM = -124;
    private static final byte VALUE_SERVER_SIDE_VERIFICATION_OPTIONS = -118;
    private static final byte VALUE_SMART_BANNER_AD_SIZE = -113;
    private static final byte VALUE_VIDEO_OPTIONS = -111;

    @NonNull
    final FlutterAdSize.AdSizeFactory adSizeFactory;

    @NonNull
    Context context;

    @Nullable
    private MediationNetworkExtrasProvider mediationNetworkExtrasProvider;

    @NonNull
    private final FlutterRequestAgentProvider requestAgentProvider;

    /* JADX INFO: renamed from: io.flutter.plugins.googlemobileads.AdMessageCodec$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$googlemobileads$FlutterAdapterStatus$AdapterInitializationState;

        static {
            int[] iArr = new int[FlutterAdapterStatus.AdapterInitializationState.values().length];
            $SwitchMap$io$flutter$plugins$googlemobileads$FlutterAdapterStatus$AdapterInitializationState = iArr;
            try {
                iArr[FlutterAdapterStatus.AdapterInitializationState.NOT_READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$plugins$googlemobileads$FlutterAdapterStatus$AdapterInitializationState[FlutterAdapterStatus.AdapterInitializationState.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @VisibleForTesting
    public AdMessageCodec(@NonNull Context context, @NonNull FlutterAdSize.AdSizeFactory adSizeFactory, @NonNull FlutterRequestAgentProvider flutterRequestAgentProvider) {
        this.context = context;
        this.adSizeFactory = adSizeFactory;
        this.requestAgentProvider = flutterRequestAgentProvider;
    }

    @Nullable
    private static Boolean booleanValueOf(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return (Boolean) obj;
    }

    @Override // pg.C2037D
    public Object readValueOfType(byte b8, ByteBuffer byteBuffer) {
        switch (b8) {
            case WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT /* -128 */:
                return new FlutterAdSize(((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue(), ((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue());
            case -127:
                return new FlutterAdRequest.Builder().setKeywords((List) readValueOfType(byteBuffer.get(), byteBuffer)).setContentUrl((String) readValueOfType(byteBuffer.get(), byteBuffer)).setNonPersonalizedAds(booleanValueOf(readValueOfType(byteBuffer.get(), byteBuffer))).setNeighboringContentUrls((List) readValueOfType(byteBuffer.get(), byteBuffer)).setHttpTimeoutMillis((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).setMediationNetworkExtrasIdentifier((String) readValueOfType(byteBuffer.get(), byteBuffer)).setMediationNetworkExtrasProvider(this.mediationNetworkExtrasProvider).setAdMobExtras((Map) readValueOfType(byteBuffer.get(), byteBuffer)).setRequestAgent(this.requestAgentProvider.getRequestAgent()).setMediationExtras((List) readValueOfType(byteBuffer.get(), byteBuffer)).build();
            case -126:
                return new FlutterAdSize.FluidAdSize();
            case -125:
            case PlaybackException.ERROR_CODE_END_OF_PLAYLIST /* -109 */:
            default:
                return super.readValueOfType(b8, byteBuffer);
            case -124:
                return new FlutterRewardedAd.FlutterRewardItem((Integer) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer));
            case -123:
                return new FlutterAd.FlutterLoadAdError(((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue(), (String) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer), (FlutterAd.FlutterResponseInfo) readValueOfType(byteBuffer.get(), byteBuffer));
            case -122:
                FlutterAdManagerAdRequest.Builder builder = new FlutterAdManagerAdRequest.Builder();
                builder.setKeywords((List) readValueOfType(byteBuffer.get(), byteBuffer));
                builder.setContentUrl((String) readValueOfType(byteBuffer.get(), byteBuffer));
                builder.setCustomTargeting((Map) readValueOfType(byteBuffer.get(), byteBuffer));
                builder.setCustomTargetingLists((Map) readValueOfType(byteBuffer.get(), byteBuffer));
                builder.setNonPersonalizedAds((Boolean) readValueOfType(byteBuffer.get(), byteBuffer));
                builder.setNeighboringContentUrls((List) readValueOfType(byteBuffer.get(), byteBuffer));
                builder.setHttpTimeoutMillis((Integer) readValueOfType(byteBuffer.get(), byteBuffer));
                builder.setPublisherProvidedId((String) readValueOfType(byteBuffer.get(), byteBuffer));
                builder.setMediationNetworkExtrasIdentifier((String) readValueOfType(byteBuffer.get(), byteBuffer));
                builder.setMediationNetworkExtrasProvider(this.mediationNetworkExtrasProvider);
                builder.setAdMobExtras((Map) readValueOfType(byteBuffer.get(), byteBuffer));
                builder.setRequestAgent(this.requestAgentProvider.getRequestAgent());
                builder.setMediationExtras((List) readValueOfType(byteBuffer.get(), byteBuffer));
                return builder.build();
            case -121:
                String str = (String) readValueOfType(byteBuffer.get(), byteBuffer);
                str.getClass();
                if (str.equals("ready")) {
                    return FlutterAdapterStatus.AdapterInitializationState.READY;
                }
                if (str.equals("notReady")) {
                    return FlutterAdapterStatus.AdapterInitializationState.NOT_READY;
                }
                throw new IllegalArgumentException("Unable to handle state: ".concat(str));
            case -120:
                return new FlutterAdapterStatus((FlutterAdapterStatus.AdapterInitializationState) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer), (Number) readValueOfType(byteBuffer.get(), byteBuffer));
            case -119:
                return new FlutterInitializationStatus((Map<String, FlutterAdapterStatus>) readValueOfType(byteBuffer.get(), byteBuffer));
            case -118:
                return new FlutterServerSideVerificationOptions((String) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer));
            case -117:
                return new FlutterAd.FlutterAdError(((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue(), (String) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer));
            case -116:
                return new FlutterAd.FlutterResponseInfo((String) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer), (List) readValueOfType(byteBuffer.get(), byteBuffer), (FlutterAd.FlutterAdapterResponseInfo) readValueOfType(byteBuffer.get(), byteBuffer), (Map) readValueOfType(byteBuffer.get(), byteBuffer));
            case -115:
                return new FlutterAd.FlutterAdapterResponseInfo((String) readValueOfType(byteBuffer.get(), byteBuffer), ((Long) readValueOfType(byteBuffer.get(), byteBuffer)).longValue(), (String) readValueOfType(byteBuffer.get(), byteBuffer), (Map) readValueOfType(byteBuffer.get(), byteBuffer), (FlutterAd.FlutterAdError) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer), (String) readValueOfType(byteBuffer.get(), byteBuffer));
            case -114:
                return new FlutterAdSize.AnchoredAdaptiveBannerAdSize(this.context, this.adSizeFactory, (String) readValueOfType(byteBuffer.get(), byteBuffer), ((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue());
            case -113:
                return new FlutterAdSize.SmartBannerAdSize();
            case -112:
                return new FlutterNativeAdOptions((Integer) readValueOfType(byteBuffer.get(), byteBuffer), (Integer) readValueOfType(byteBuffer.get(), byteBuffer), (FlutterVideoOptions) readValueOfType(byteBuffer.get(), byteBuffer), (Boolean) readValueOfType(byteBuffer.get(), byteBuffer), (Boolean) readValueOfType(byteBuffer.get(), byteBuffer), (Boolean) readValueOfType(byteBuffer.get(), byteBuffer));
            case -111:
                return new FlutterVideoOptions((Boolean) readValueOfType(byteBuffer.get(), byteBuffer), (Boolean) readValueOfType(byteBuffer.get(), byteBuffer), (Boolean) readValueOfType(byteBuffer.get(), byteBuffer));
            case PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING /* -110 */:
                Integer num = (Integer) readValueOfType(byteBuffer.get(), byteBuffer);
                return new FlutterAdSize.InlineAdaptiveBannerAdSize(this.adSizeFactory, this.context, num.intValue(), (Integer) readValueOfType(byteBuffer.get(), byteBuffer), (Integer) readValueOfType(byteBuffer.get(), byteBuffer));
            case PlaybackException.ERROR_CODE_SETUP_REQUIRED /* -108 */:
                RequestConfiguration.Builder builder2 = new RequestConfiguration.Builder();
                builder2.setMaxAdContentRating((String) readValueOfType(byteBuffer.get(), byteBuffer));
                builder2.setTagForChildDirectedTreatment(((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue());
                builder2.setTagForUnderAgeOfConsent(((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue());
                builder2.setTestDeviceIds((List) readValueOfType(byteBuffer.get(), byteBuffer));
                return builder2.build();
            case PlaybackException.ERROR_CODE_SKIP_LIMIT_REACHED /* -107 */:
                return new FlutterNativeTemplateStyle((FlutterNativeTemplateType) readValueOfType(byteBuffer.get(), byteBuffer), (ColorDrawable) readValueOfType(byteBuffer.get(), byteBuffer), (FlutterNativeTemplateTextStyle) readValueOfType(byteBuffer.get(), byteBuffer), (FlutterNativeTemplateTextStyle) readValueOfType(byteBuffer.get(), byteBuffer), (FlutterNativeTemplateTextStyle) readValueOfType(byteBuffer.get(), byteBuffer), (FlutterNativeTemplateTextStyle) readValueOfType(byteBuffer.get(), byteBuffer));
            case PlaybackException.ERROR_CODE_NOT_AVAILABLE_IN_REGION /* -106 */:
                return new FlutterNativeTemplateTextStyle((ColorDrawable) readValueOfType(byteBuffer.get(), byteBuffer), (ColorDrawable) readValueOfType(byteBuffer.get(), byteBuffer), (FlutterNativeTemplateFontStyle) readValueOfType(byteBuffer.get(), byteBuffer), (Double) readValueOfType(byteBuffer.get(), byteBuffer));
            case PlaybackException.ERROR_CODE_PARENTAL_CONTROL_RESTRICTED /* -105 */:
                return FlutterNativeTemplateFontStyle.fromIntValue(((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue());
            case PlaybackException.ERROR_CODE_CONCURRENT_STREAM_LIMIT /* -104 */:
                return FlutterNativeTemplateType.fromIntValue(((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue());
            case PlaybackException.ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED /* -103 */:
                return new ColorDrawable(Color.argb(((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue(), ((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue(), ((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue(), ((Integer) readValueOfType(byteBuffer.get(), byteBuffer)).intValue()));
            case PlaybackException.ERROR_CODE_AUTHENTICATION_EXPIRED /* -102 */:
                String str2 = (String) readValueOfType(byteBuffer.get(), byteBuffer);
                Map<String, Object> map = (Map) readValueOfType(byteBuffer.get(), byteBuffer);
                try {
                    FlutterMediationExtras flutterMediationExtras = (FlutterMediationExtras) Class.forName(str2).getDeclaredConstructor(null).newInstance(null);
                    flutterMediationExtras.setMediationExtras(map);
                    return flutterMediationExtras;
                } catch (ClassNotFoundException unused) {
                    Log.e("FlutterMediationExtras", "Class not found: " + str2);
                    return null;
                } catch (IllegalAccessException unused2) {
                    Log.e("FlutterMediationExtras", "Illegal Access to " + str2);
                    return null;
                } catch (InstantiationException unused3) {
                    Log.e("FlutterMediationExtras", "Unable to instantiate class " + str2);
                    return null;
                } catch (NoSuchMethodException unused4) {
                    Log.e("FlutterMediationExtras", "No such method found: " + str2 + ".getDeclaredConstructor()");
                    return null;
                } catch (InvocationTargetException unused5) {
                    Log.e("FlutterMediationExtras", "Invocation Target Exception for: " + str2);
                    return null;
                }
        }
    }

    public void setContext(@NonNull Context context) {
        this.context = context;
    }

    public void setMediationNetworkExtrasProvider(@Nullable MediationNetworkExtrasProvider mediationNetworkExtrasProvider) {
        this.mediationNetworkExtrasProvider = mediationNetworkExtrasProvider;
    }

    public void writeAdSize(ByteArrayOutputStream byteArrayOutputStream, FlutterAdSize flutterAdSize) {
        if (flutterAdSize instanceof FlutterAdSize.InlineAdaptiveBannerAdSize) {
            FlutterAdSize.InlineAdaptiveBannerAdSize inlineAdaptiveBannerAdSize = (FlutterAdSize.InlineAdaptiveBannerAdSize) flutterAdSize;
            byteArrayOutputStream.write(PlaybackException.ERROR_CODE_CONTENT_ALREADY_PLAYING);
            writeValue(byteArrayOutputStream, Integer.valueOf(inlineAdaptiveBannerAdSize.width));
            writeValue(byteArrayOutputStream, inlineAdaptiveBannerAdSize.maxHeight);
            writeValue(byteArrayOutputStream, inlineAdaptiveBannerAdSize.orientation);
            return;
        }
        if (flutterAdSize instanceof FlutterAdSize.AnchoredAdaptiveBannerAdSize) {
            byteArrayOutputStream.write(-114);
            FlutterAdSize.AnchoredAdaptiveBannerAdSize anchoredAdaptiveBannerAdSize = (FlutterAdSize.AnchoredAdaptiveBannerAdSize) flutterAdSize;
            writeValue(byteArrayOutputStream, anchoredAdaptiveBannerAdSize.orientation);
            writeValue(byteArrayOutputStream, Integer.valueOf(anchoredAdaptiveBannerAdSize.width));
            return;
        }
        if (flutterAdSize instanceof FlutterAdSize.SmartBannerAdSize) {
            byteArrayOutputStream.write(-113);
        } else {
            if (flutterAdSize instanceof FlutterAdSize.FluidAdSize) {
                byteArrayOutputStream.write(-126);
                return;
            }
            byteArrayOutputStream.write(WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
            writeValue(byteArrayOutputStream, Integer.valueOf(flutterAdSize.width));
            writeValue(byteArrayOutputStream, Integer.valueOf(flutterAdSize.height));
        }
    }

    @Override // pg.C2037D
    public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof FlutterAdSize) {
            writeAdSize(byteArrayOutputStream, (FlutterAdSize) obj);
            return;
        }
        if (obj instanceof FlutterAdManagerAdRequest) {
            byteArrayOutputStream.write(-122);
            FlutterAdManagerAdRequest flutterAdManagerAdRequest = (FlutterAdManagerAdRequest) obj;
            writeValue(byteArrayOutputStream, flutterAdManagerAdRequest.getKeywords());
            writeValue(byteArrayOutputStream, flutterAdManagerAdRequest.getContentUrl());
            writeValue(byteArrayOutputStream, flutterAdManagerAdRequest.getCustomTargeting());
            writeValue(byteArrayOutputStream, flutterAdManagerAdRequest.getCustomTargetingLists());
            writeValue(byteArrayOutputStream, flutterAdManagerAdRequest.getNonPersonalizedAds());
            writeValue(byteArrayOutputStream, flutterAdManagerAdRequest.getNeighboringContentUrls());
            writeValue(byteArrayOutputStream, flutterAdManagerAdRequest.getHttpTimeoutMillis());
            writeValue(byteArrayOutputStream, flutterAdManagerAdRequest.getPublisherProvidedId());
            writeValue(byteArrayOutputStream, flutterAdManagerAdRequest.getMediationExtrasIdentifier());
            writeValue(byteArrayOutputStream, flutterAdManagerAdRequest.getAdMobExtras());
            writeValue(byteArrayOutputStream, flutterAdManagerAdRequest.getMediationExtras());
            return;
        }
        if (obj instanceof FlutterAdRequest) {
            byteArrayOutputStream.write(-127);
            FlutterAdRequest flutterAdRequest = (FlutterAdRequest) obj;
            writeValue(byteArrayOutputStream, flutterAdRequest.getKeywords());
            writeValue(byteArrayOutputStream, flutterAdRequest.getContentUrl());
            writeValue(byteArrayOutputStream, flutterAdRequest.getNonPersonalizedAds());
            writeValue(byteArrayOutputStream, flutterAdRequest.getNeighboringContentUrls());
            writeValue(byteArrayOutputStream, flutterAdRequest.getHttpTimeoutMillis());
            writeValue(byteArrayOutputStream, flutterAdRequest.getMediationExtrasIdentifier());
            writeValue(byteArrayOutputStream, flutterAdRequest.getAdMobExtras());
            writeValue(byteArrayOutputStream, flutterAdRequest.getMediationExtras());
            return;
        }
        if (obj instanceof FlutterMediationExtras) {
            byteArrayOutputStream.write(PlaybackException.ERROR_CODE_AUTHENTICATION_EXPIRED);
            FlutterMediationExtras flutterMediationExtras = (FlutterMediationExtras) obj;
            writeValue(byteArrayOutputStream, flutterMediationExtras.getClass().getCanonicalName());
            writeValue(byteArrayOutputStream, flutterMediationExtras.extras);
            return;
        }
        if (obj instanceof FlutterRewardedAd.FlutterRewardItem) {
            byteArrayOutputStream.write(-124);
            FlutterRewardedAd.FlutterRewardItem flutterRewardItem = (FlutterRewardedAd.FlutterRewardItem) obj;
            writeValue(byteArrayOutputStream, flutterRewardItem.amount);
            writeValue(byteArrayOutputStream, flutterRewardItem.type);
            return;
        }
        if (obj instanceof FlutterAd.FlutterAdapterResponseInfo) {
            byteArrayOutputStream.write(-115);
            FlutterAd.FlutterAdapterResponseInfo flutterAdapterResponseInfo = (FlutterAd.FlutterAdapterResponseInfo) obj;
            writeValue(byteArrayOutputStream, flutterAdapterResponseInfo.getAdapterClassName());
            writeValue(byteArrayOutputStream, Long.valueOf(flutterAdapterResponseInfo.getLatencyMillis()));
            writeValue(byteArrayOutputStream, flutterAdapterResponseInfo.getDescription());
            writeValue(byteArrayOutputStream, flutterAdapterResponseInfo.getAdUnitMapping());
            writeValue(byteArrayOutputStream, flutterAdapterResponseInfo.getError());
            writeValue(byteArrayOutputStream, flutterAdapterResponseInfo.getAdSourceName());
            writeValue(byteArrayOutputStream, flutterAdapterResponseInfo.getAdSourceId());
            writeValue(byteArrayOutputStream, flutterAdapterResponseInfo.getAdSourceInstanceName());
            writeValue(byteArrayOutputStream, flutterAdapterResponseInfo.getAdSourceInstanceId());
            return;
        }
        if (obj instanceof FlutterAd.FlutterResponseInfo) {
            byteArrayOutputStream.write(-116);
            FlutterAd.FlutterResponseInfo flutterResponseInfo = (FlutterAd.FlutterResponseInfo) obj;
            writeValue(byteArrayOutputStream, flutterResponseInfo.getResponseId());
            writeValue(byteArrayOutputStream, flutterResponseInfo.getMediationAdapterClassName());
            writeValue(byteArrayOutputStream, flutterResponseInfo.getAdapterResponses());
            writeValue(byteArrayOutputStream, flutterResponseInfo.getLoadedAdapterResponseInfo());
            writeValue(byteArrayOutputStream, flutterResponseInfo.getResponseExtras());
            return;
        }
        if (obj instanceof FlutterAd.FlutterLoadAdError) {
            byteArrayOutputStream.write(-123);
            FlutterAd.FlutterLoadAdError flutterLoadAdError = (FlutterAd.FlutterLoadAdError) obj;
            writeValue(byteArrayOutputStream, Integer.valueOf(flutterLoadAdError.code));
            writeValue(byteArrayOutputStream, flutterLoadAdError.domain);
            writeValue(byteArrayOutputStream, flutterLoadAdError.message);
            writeValue(byteArrayOutputStream, flutterLoadAdError.responseInfo);
            return;
        }
        if (obj instanceof FlutterAd.FlutterAdError) {
            byteArrayOutputStream.write(-117);
            FlutterAd.FlutterAdError flutterAdError = (FlutterAd.FlutterAdError) obj;
            writeValue(byteArrayOutputStream, Integer.valueOf(flutterAdError.code));
            writeValue(byteArrayOutputStream, flutterAdError.domain);
            writeValue(byteArrayOutputStream, flutterAdError.message);
            return;
        }
        if (obj instanceof FlutterAdapterStatus.AdapterInitializationState) {
            byteArrayOutputStream.write(-121);
            FlutterAdapterStatus.AdapterInitializationState adapterInitializationState = (FlutterAdapterStatus.AdapterInitializationState) obj;
            int i = AnonymousClass1.$SwitchMap$io$flutter$plugins$googlemobileads$FlutterAdapterStatus$AdapterInitializationState[adapterInitializationState.ordinal()];
            if (i == 1) {
                writeValue(byteArrayOutputStream, "notReady");
                return;
            } else if (i == 2) {
                writeValue(byteArrayOutputStream, "ready");
                return;
            } else {
                throw new IllegalArgumentException("Unable to handle state: " + adapterInitializationState);
            }
        }
        if (obj instanceof FlutterAdapterStatus) {
            byteArrayOutputStream.write(-120);
            FlutterAdapterStatus flutterAdapterStatus = (FlutterAdapterStatus) obj;
            writeValue(byteArrayOutputStream, flutterAdapterStatus.state);
            writeValue(byteArrayOutputStream, flutterAdapterStatus.description);
            writeValue(byteArrayOutputStream, flutterAdapterStatus.latency);
            return;
        }
        if (obj instanceof FlutterInitializationStatus) {
            byteArrayOutputStream.write(-119);
            writeValue(byteArrayOutputStream, ((FlutterInitializationStatus) obj).adapterStatuses);
            return;
        }
        if (obj instanceof FlutterServerSideVerificationOptions) {
            byteArrayOutputStream.write(-118);
            FlutterServerSideVerificationOptions flutterServerSideVerificationOptions = (FlutterServerSideVerificationOptions) obj;
            writeValue(byteArrayOutputStream, flutterServerSideVerificationOptions.getUserId());
            writeValue(byteArrayOutputStream, flutterServerSideVerificationOptions.getCustomData());
            return;
        }
        if (obj instanceof FlutterNativeAdOptions) {
            byteArrayOutputStream.write(-112);
            FlutterNativeAdOptions flutterNativeAdOptions = (FlutterNativeAdOptions) obj;
            writeValue(byteArrayOutputStream, flutterNativeAdOptions.adChoicesPlacement);
            writeValue(byteArrayOutputStream, flutterNativeAdOptions.mediaAspectRatio);
            writeValue(byteArrayOutputStream, flutterNativeAdOptions.videoOptions);
            writeValue(byteArrayOutputStream, flutterNativeAdOptions.requestCustomMuteThisAd);
            writeValue(byteArrayOutputStream, flutterNativeAdOptions.shouldRequestMultipleImages);
            writeValue(byteArrayOutputStream, flutterNativeAdOptions.shouldReturnUrlsForImageAssets);
            return;
        }
        if (obj instanceof RequestConfiguration) {
            byteArrayOutputStream.write(PlaybackException.ERROR_CODE_SETUP_REQUIRED);
            RequestConfiguration requestConfiguration = (RequestConfiguration) obj;
            writeValue(byteArrayOutputStream, requestConfiguration.getMaxAdContentRating());
            writeValue(byteArrayOutputStream, Integer.valueOf(requestConfiguration.getTagForChildDirectedTreatment()));
            writeValue(byteArrayOutputStream, Integer.valueOf(requestConfiguration.getTagForUnderAgeOfConsent()));
            writeValue(byteArrayOutputStream, requestConfiguration.getTestDeviceIds());
            return;
        }
        if (obj instanceof FlutterVideoOptions) {
            byteArrayOutputStream.write(-111);
            FlutterVideoOptions flutterVideoOptions = (FlutterVideoOptions) obj;
            writeValue(byteArrayOutputStream, flutterVideoOptions.clickToExpandRequested);
            writeValue(byteArrayOutputStream, flutterVideoOptions.customControlsRequested);
            writeValue(byteArrayOutputStream, flutterVideoOptions.startMuted);
            return;
        }
        if (obj instanceof FlutterNativeTemplateStyle) {
            byteArrayOutputStream.write(PlaybackException.ERROR_CODE_SKIP_LIMIT_REACHED);
            FlutterNativeTemplateStyle flutterNativeTemplateStyle = (FlutterNativeTemplateStyle) obj;
            writeValue(byteArrayOutputStream, flutterNativeTemplateStyle.getTemplateType());
            writeValue(byteArrayOutputStream, flutterNativeTemplateStyle.getMainBackgroundColor());
            writeValue(byteArrayOutputStream, flutterNativeTemplateStyle.getCallToActionStyle());
            writeValue(byteArrayOutputStream, flutterNativeTemplateStyle.getPrimaryTextStyle());
            writeValue(byteArrayOutputStream, flutterNativeTemplateStyle.getSecondaryTextStyle());
            writeValue(byteArrayOutputStream, flutterNativeTemplateStyle.getTertiaryTextStyle());
            return;
        }
        if (obj instanceof FlutterNativeTemplateFontStyle) {
            byteArrayOutputStream.write(PlaybackException.ERROR_CODE_PARENTAL_CONTROL_RESTRICTED);
            writeValue(byteArrayOutputStream, Integer.valueOf(((FlutterNativeTemplateFontStyle) obj).ordinal()));
            return;
        }
        if (obj instanceof FlutterNativeTemplateType) {
            byteArrayOutputStream.write(PlaybackException.ERROR_CODE_CONCURRENT_STREAM_LIMIT);
            writeValue(byteArrayOutputStream, Integer.valueOf(((FlutterNativeTemplateType) obj).ordinal()));
            return;
        }
        if (obj instanceof FlutterNativeTemplateTextStyle) {
            byteArrayOutputStream.write(PlaybackException.ERROR_CODE_NOT_AVAILABLE_IN_REGION);
            FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle = (FlutterNativeTemplateTextStyle) obj;
            writeValue(byteArrayOutputStream, flutterNativeTemplateTextStyle.getTextColor());
            writeValue(byteArrayOutputStream, flutterNativeTemplateTextStyle.getBackgroundColor());
            writeValue(byteArrayOutputStream, flutterNativeTemplateTextStyle.getFontStyle());
            writeValue(byteArrayOutputStream, flutterNativeTemplateTextStyle.getSize());
            return;
        }
        if (!(obj instanceof ColorDrawable)) {
            super.writeValue(byteArrayOutputStream, obj);
            return;
        }
        byteArrayOutputStream.write(PlaybackException.ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED);
        int color = ((ColorDrawable) obj).getColor();
        writeValue(byteArrayOutputStream, Integer.valueOf(Color.alpha(color)));
        writeValue(byteArrayOutputStream, Integer.valueOf(Color.red(color)));
        writeValue(byteArrayOutputStream, Integer.valueOf(Color.green(color)));
        writeValue(byteArrayOutputStream, Integer.valueOf(Color.blue(color)));
    }

    public AdMessageCodec(@NonNull Context context, @NonNull FlutterRequestAgentProvider flutterRequestAgentProvider) {
        this.context = context;
        this.adSizeFactory = new FlutterAdSize.AdSizeFactory();
        this.requestAgentProvider = flutterRequestAgentProvider;
    }
}
