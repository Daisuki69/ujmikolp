package androidx.camera.extensions;

import android.content.Context;
import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraProvider;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigProvider;
import androidx.camera.core.impl.ExtendedCameraConfigProviderStore;
import androidx.camera.core.impl.Identifier;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.extensions.ExtensionsConfig;
import androidx.camera.extensions.internal.AdvancedVendorExtender;
import androidx.camera.extensions.internal.BasicVendorExtender;
import androidx.camera.extensions.internal.ClientVersion;
import androidx.camera.extensions.internal.ExtensionVersion;
import androidx.camera.extensions.internal.ExtensionsUseCaseConfigFactory;
import androidx.camera.extensions.internal.VendorExtender;
import androidx.camera.extensions.internal.Version;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class ExtensionsInfo {
    private static final String EXTENDED_CAMERA_CONFIG_PROVIDER_ID_PREFIX = ":camera:camera-extensions-";
    private final CameraProvider mCameraProvider;

    @NonNull
    private VendorExtenderFactory mVendorExtenderFactory = new c();

    /* JADX INFO: renamed from: androidx.camera.extensions.ExtensionsInfo$1, reason: invalid class name */
    public class AnonymousClass1 implements VendorExtender {
        @Override // androidx.camera.extensions.internal.VendorExtender
        public final /* synthetic */ SessionProcessor createSessionProcessor(Context context) {
            return androidx.camera.extensions.internal.a.a(this, context);
        }

        @Override // androidx.camera.extensions.internal.VendorExtender
        public final /* synthetic */ Range getEstimatedCaptureLatencyRange(Size size) {
            return androidx.camera.extensions.internal.a.b(this, size);
        }

        @Override // androidx.camera.extensions.internal.VendorExtender
        public final /* synthetic */ List getSupportedCaptureOutputResolutions() {
            return androidx.camera.extensions.internal.a.c(this);
        }

        @Override // androidx.camera.extensions.internal.VendorExtender
        public final /* synthetic */ List getSupportedCaptureResultKeys() {
            return androidx.camera.extensions.internal.a.d(this);
        }

        @Override // androidx.camera.extensions.internal.VendorExtender
        public final /* synthetic */ Map getSupportedPostviewResolutions(Size size) {
            return androidx.camera.extensions.internal.a.e(this, size);
        }

        @Override // androidx.camera.extensions.internal.VendorExtender
        public final /* synthetic */ List getSupportedPreviewOutputResolutions() {
            return androidx.camera.extensions.internal.a.f(this);
        }

        @Override // androidx.camera.extensions.internal.VendorExtender
        public final /* synthetic */ Size[] getSupportedYuvAnalysisResolutions() {
            return androidx.camera.extensions.internal.a.g(this);
        }

        @Override // androidx.camera.extensions.internal.VendorExtender
        public final /* synthetic */ void init(CameraInfo cameraInfo) {
            androidx.camera.extensions.internal.a.h(this, cameraInfo);
        }

        @Override // androidx.camera.extensions.internal.VendorExtender
        public final /* synthetic */ boolean isCaptureProcessProgressAvailable() {
            return androidx.camera.extensions.internal.a.i(this);
        }

        @Override // androidx.camera.extensions.internal.VendorExtender
        public final /* synthetic */ boolean isCurrentExtensionModeAvailable() {
            return androidx.camera.extensions.internal.a.j(this);
        }

        @Override // androidx.camera.extensions.internal.VendorExtender
        public final /* synthetic */ boolean isExtensionAvailable(String str, Map map) {
            return androidx.camera.extensions.internal.a.k(this, str, map);
        }

        @Override // androidx.camera.extensions.internal.VendorExtender
        public final /* synthetic */ boolean isExtensionStrengthAvailable() {
            return androidx.camera.extensions.internal.a.l(this);
        }

        @Override // androidx.camera.extensions.internal.VendorExtender
        public final /* synthetic */ boolean isPostviewAvailable() {
            return androidx.camera.extensions.internal.a.m(this);
        }

        @Override // androidx.camera.extensions.internal.VendorExtender
        public final /* synthetic */ boolean willReceiveOnCaptureCompleted() {
            return androidx.camera.extensions.internal.a.n(this);
        }
    }

    public ExtensionsInfo(@NonNull CameraProvider cameraProvider) {
        this.mCameraProvider = cameraProvider;
    }

    private static String getExtendedCameraConfigProviderId(int i) {
        if (i == 0) {
            return ":camera:camera-extensions-EXTENSION_MODE_NONE";
        }
        if (i == 1) {
            return ":camera:camera-extensions-EXTENSION_MODE_BOKEH";
        }
        if (i == 2) {
            return ":camera:camera-extensions-EXTENSION_MODE_HDR";
        }
        if (i == 3) {
            return ":camera:camera-extensions-EXTENSION_MODE_NIGHT";
        }
        if (i == 4) {
            return ":camera:camera-extensions-EXTENSION_MODE_FACE_RETOUCH";
        }
        if (i == 5) {
            return ":camera:camera-extensions-EXTENSION_MODE_AUTO";
        }
        throw new IllegalArgumentException("Invalid extension mode!");
    }

    private CameraFilter getFilter(int i) {
        return new ExtensionCameraFilter(getExtendedCameraConfigProviderId(i), this.mVendorExtenderFactory.createVendorExtender(i));
    }

    @NonNull
    public static VendorExtender getVendorExtender(int i) {
        return isAdvancedExtenderSupported() ? new AdvancedVendorExtender(i) : new BasicVendorExtender(i);
    }

    private void injectExtensionCameraConfig(final int i) {
        final Identifier identifierCreate = Identifier.create(getExtendedCameraConfigProviderId(i));
        if (ExtendedCameraConfigProviderStore.getConfigProvider(identifierCreate) == CameraConfigProvider.EMPTY) {
            ExtendedCameraConfigProviderStore.addConfig(identifierCreate, new CameraConfigProvider() { // from class: androidx.camera.extensions.d
                @Override // androidx.camera.core.impl.CameraConfigProvider
                public final CameraConfig getConfig(CameraInfo cameraInfo, Context context) {
                    return this.f7620a.lambda$injectExtensionCameraConfig$1(i, identifierCreate, cameraInfo, context);
                }
            });
        }
    }

    private static boolean isAdvancedExtenderSupported() {
        Version version = Version.VERSION_1_1;
        if (ClientVersion.isMaximumCompatibleVersion(version) || ExtensionVersion.isMaximumCompatibleVersion(version)) {
            return false;
        }
        return ExtensionVersion.isAdvancedExtenderSupported();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ CameraConfig lambda$injectExtensionCameraConfig$1(int i, Identifier identifier, CameraInfo cameraInfo, Context context) {
        VendorExtender vendorExtenderCreateVendorExtender = this.mVendorExtenderFactory.createVendorExtender(i);
        vendorExtenderCreateVendorExtender.init(cameraInfo);
        ExtensionsConfig.Builder useCaseCombinationRequiredRule = new ExtensionsConfig.Builder().setExtensionMode(i).setUseCaseConfigFactory((UseCaseConfigFactory) new ExtensionsUseCaseConfigFactory(vendorExtenderCreateVendorExtender)).setCompatibilityId(identifier).setZslDisabled(true).setPostviewSupported(vendorExtenderCreateVendorExtender.isPostviewAvailable()).setCaptureProcessProgressSupported(vendorExtenderCreateVendorExtender.isCaptureProcessProgressAvailable()).setUseCaseCombinationRequiredRule(1);
        SessionProcessor sessionProcessorCreateSessionProcessor = vendorExtenderCreateVendorExtender.createSessionProcessor(context);
        if (sessionProcessorCreateSessionProcessor != null) {
            useCaseCombinationRequiredRule.setSessionProcessor(sessionProcessorCreateSessionProcessor);
        }
        return useCaseCombinationRequiredRule.build();
    }

    @Nullable
    public Range<Long> getEstimatedCaptureLatencyRange(@NonNull CameraSelector cameraSelector, int i, @Nullable Size size) {
        List<CameraInfo> listFilter = CameraSelector.Builder.fromSelector(cameraSelector).addCameraFilter(getFilter(i)).build().filter(this.mCameraProvider.getAvailableCameraInfos());
        if (listFilter.isEmpty()) {
            return null;
        }
        CameraInfo cameraInfo = listFilter.get(0);
        if (ExtensionVersion.getRuntimeVersion().compareTo(Version.VERSION_1_2) < 0) {
            return null;
        }
        try {
            VendorExtender vendorExtenderCreateVendorExtender = this.mVendorExtenderFactory.createVendorExtender(i);
            vendorExtenderCreateVendorExtender.init(cameraInfo);
            return vendorExtenderCreateVendorExtender.getEstimatedCaptureLatencyRange(size);
        } catch (NoSuchMethodError unused) {
            return null;
        }
    }

    @NonNull
    public CameraSelector getExtensionCameraSelectorAndInjectCameraConfig(@NonNull CameraSelector cameraSelector, int i) {
        if (!isExtensionAvailable(cameraSelector, i)) {
            throw new IllegalArgumentException("No camera can be found to support the specified extensions mode! isExtensionAvailable should be checked first before calling getExtensionEnabledCameraSelector.");
        }
        Iterator<CameraFilter> it = cameraSelector.getCameraFilterSet().iterator();
        while (it.hasNext()) {
            if (it.next() instanceof ExtensionCameraFilter) {
                throw new IllegalArgumentException("An extension is already applied to the base CameraSelector.");
            }
        }
        injectExtensionCameraConfig(i);
        CameraSelector.Builder builderFromSelector = CameraSelector.Builder.fromSelector(cameraSelector);
        builderFromSelector.addCameraFilter(getFilter(i));
        return builderFromSelector.build();
    }

    public boolean isExtensionAvailable(@NonNull CameraSelector cameraSelector, int i) {
        CameraSelector.Builder.fromSelector(cameraSelector).addCameraFilter(getFilter(i));
        return !r1.build().filter(this.mCameraProvider.getAvailableCameraInfos()).isEmpty();
    }

    public boolean isImageAnalysisSupported(@NonNull CameraSelector cameraSelector, int i) {
        List<CameraInfo> listFilter = CameraSelector.Builder.fromSelector(cameraSelector).addCameraFilter(getFilter(i)).build().filter(this.mCameraProvider.getAvailableCameraInfos());
        if (!listFilter.isEmpty()) {
            CameraInfo cameraInfo = listFilter.get(0);
            VendorExtender vendorExtenderCreateVendorExtender = this.mVendorExtenderFactory.createVendorExtender(i);
            vendorExtenderCreateVendorExtender.init(cameraInfo);
            Size[] supportedYuvAnalysisResolutions = vendorExtenderCreateVendorExtender.getSupportedYuvAnalysisResolutions();
            if (supportedYuvAnalysisResolutions != null && supportedYuvAnalysisResolutions.length > 0) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting
    public void setVendorExtenderFactory(@NonNull VendorExtenderFactory vendorExtenderFactory) {
        this.mVendorExtenderFactory = vendorExtenderFactory;
    }
}
