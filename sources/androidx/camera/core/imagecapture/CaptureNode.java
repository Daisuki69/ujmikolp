package androidx.camera.core.imagecapture;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.ImageReaderProxys;
import androidx.camera.core.Logger;
import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.imagecapture.ProcessingNode;
import androidx.camera.core.imagecapture.TakePictureManager;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureCallbacks;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.processing.Edge;
import androidx.camera.core.processing.Node;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class CaptureNode implements Node<In, ProcessingNode.In> {

    @VisibleForTesting
    static final int MAX_IMAGES = 4;
    private static final String TAG = "CaptureNode";

    @Nullable
    private In mInputEdge;

    @Nullable
    private ProcessingNode.In mOutputEdge;

    @Nullable
    SafeCloseImageReaderProxy mSafeCloseImageReaderForPostview;

    @Nullable
    SafeCloseImageReaderProxy mSafeCloseImageReaderProxy;
    ProcessingRequest mCurrentRequest = null;

    @Nullable
    private NoMetadataImageReader mNoMetadataImageReader = null;

    /* JADX INFO: renamed from: androidx.camera.core.imagecapture.CaptureNode$1, reason: invalid class name */
    public class AnonymousClass1 extends CameraCaptureCallback {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureProcessProgressed$1(int i) {
            ProcessingRequest processingRequest = CaptureNode.this.mCurrentRequest;
            if (processingRequest != null) {
                processingRequest.onCaptureProcessProgressed(i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureStarted$0() {
            ProcessingRequest processingRequest = CaptureNode.this.mCurrentRequest;
            if (processingRequest != null) {
                processingRequest.onCaptureStarted();
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureProcessProgressed(int i, int i4) {
            CameraXExecutors.mainThreadExecutor().execute(new d(this, i4, 0));
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureStarted(int i) {
            CameraXExecutors.mainThreadExecutor().execute(new c(this, 2));
        }
    }

    public static abstract class In {

        @NonNull
        private CameraCaptureCallback mCameraCaptureCallback = new CameraCaptureCallback() { // from class: androidx.camera.core.imagecapture.CaptureNode.In.1
        };

        @Nullable
        private DeferrableSurface mPostviewSurface = null;

        @Nullable
        private DeferrableSurface mSurface;

        @NonNull
        public static In of(Size size, int i, int i4, boolean z4, @Nullable ImageReaderProxyProvider imageReaderProxyProvider) {
            return new AutoValue_CaptureNode_In(size, i, i4, z4, imageReaderProxyProvider, null, 35, new Edge(), new Edge());
        }

        @NonNull
        public CameraCaptureCallback getCameraCaptureCallback() {
            return this.mCameraCaptureCallback;
        }

        @NonNull
        public abstract Edge<TakePictureManager.CaptureError> getErrorEdge();

        @Nullable
        public abstract ImageReaderProxyProvider getImageReaderProxyProvider();

        public abstract int getInputFormat();

        public abstract int getOutputFormat();

        public abstract int getPostviewImageFormat();

        @Nullable
        public abstract Size getPostviewSize();

        @Nullable
        public DeferrableSurface getPostviewSurface() {
            return this.mPostviewSurface;
        }

        @NonNull
        public abstract Edge<ProcessingRequest> getRequestEdge();

        public abstract Size getSize();

        @NonNull
        public DeferrableSurface getSurface() {
            DeferrableSurface deferrableSurface = this.mSurface;
            Objects.requireNonNull(deferrableSurface);
            return deferrableSurface;
        }

        public abstract boolean isVirtualCamera();

        public void setCameraCaptureCallback(@NonNull CameraCaptureCallback cameraCaptureCallback) {
            this.mCameraCaptureCallback = cameraCaptureCallback;
        }

        public void setPostviewSurface(@NonNull Surface surface, @NonNull Size size, int i) {
            this.mPostviewSurface = new ImmediateSurface(surface, size, i);
        }

        public void setSurface(@NonNull Surface surface) {
            Preconditions.checkState(this.mSurface == null, "The surface is already set.");
            this.mSurface = new ImmediateSurface(surface, getSize(), getInputFormat());
        }

        @NonNull
        public static In of(Size size, int i, int i4, boolean z4, @Nullable ImageReaderProxyProvider imageReaderProxyProvider, @Nullable Size size2, int i6) {
            return new AutoValue_CaptureNode_In(size, i, i4, z4, imageReaderProxyProvider, size2, i6, new Edge(), new Edge());
        }
    }

    @NonNull
    private static ImageReaderProxy createImageReaderProxy(@Nullable ImageReaderProxyProvider imageReaderProxyProvider, int i, int i4, int i6) {
        return imageReaderProxyProvider != null ? imageReaderProxyProvider.newInstance(i, i4, i6, 4, 0L) : ImageReaderProxys.createIsolatedReader(i, i4, i6, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$releaseInputResources$4(SafeCloseImageReaderProxy safeCloseImageReaderProxy) {
        if (safeCloseImageReaderProxy != null) {
            safeCloseImageReaderProxy.safeClose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transform$0(ProcessingRequest processingRequest) {
        onRequestAvailable(processingRequest);
        this.mNoMetadataImageReader.acceptProcessingRequest(processingRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transform$1(ImageReaderProxy imageReaderProxy) {
        try {
            ImageProxy imageProxyAcquireLatestImage = imageReaderProxy.acquireLatestImage();
            if (imageProxyAcquireLatestImage != null) {
                onImageProxyAvailable(imageProxyAcquireLatestImage);
                return;
            }
            ProcessingRequest processingRequest = this.mCurrentRequest;
            if (processingRequest != null) {
                sendCaptureError(TakePictureManager.CaptureError.of(processingRequest.getRequestId(), new ImageCaptureException(2, "Failed to acquire latest image", null)));
            }
        } catch (IllegalStateException e) {
            ProcessingRequest processingRequest2 = this.mCurrentRequest;
            if (processingRequest2 != null) {
                sendCaptureError(TakePictureManager.CaptureError.of(processingRequest2.getRequestId(), new ImageCaptureException(2, "Failed to acquire latest image", e)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transform$2(ImageReaderProxy imageReaderProxy) {
        try {
            ImageProxy imageProxyAcquireLatestImage = imageReaderProxy.acquireLatestImage();
            if (imageProxyAcquireLatestImage != null) {
                propagatePostviewImage(imageProxyAcquireLatestImage);
            }
        } catch (IllegalStateException e) {
            Logger.e(TAG, "Failed to acquire latest image of postview", e);
        }
    }

    @MainThread
    private void matchAndPropagateImage(@NonNull ImageProxy imageProxy) {
        Threads.checkMainThread();
        ProcessingNode.In in = this.mOutputEdge;
        Objects.requireNonNull(in);
        in.getEdge().accept(ProcessingNode.InputPacket.of(this.mCurrentRequest, imageProxy));
        ProcessingRequest processingRequest = this.mCurrentRequest;
        this.mCurrentRequest = null;
        processingRequest.onImageCaptured();
    }

    private void propagatePostviewImage(@NonNull ImageProxy imageProxy) {
        if (this.mCurrentRequest == null) {
            Logger.w(TAG, "Postview image is closed due to request completed or aborted");
            imageProxy.close();
        } else {
            ProcessingNode.In in = this.mOutputEdge;
            Objects.requireNonNull(in);
            in.getPostviewEdge().accept(ProcessingNode.InputPacket.of(this.mCurrentRequest, imageProxy));
        }
    }

    private void releaseInputResources(@NonNull In in, @NonNull SafeCloseImageReaderProxy safeCloseImageReaderProxy, @Nullable SafeCloseImageReaderProxy safeCloseImageReaderProxy2) {
        in.getSurface().close();
        in.getSurface().getTerminationFuture().addListener(new c(safeCloseImageReaderProxy, 0), CameraXExecutors.mainThreadExecutor());
        if (in.getPostviewSurface() != null) {
            in.getPostviewSurface().close();
            in.getPostviewSurface().getTerminationFuture().addListener(new c(safeCloseImageReaderProxy2, 1), CameraXExecutors.mainThreadExecutor());
        }
    }

    @MainThread
    public int getCapacity() {
        Threads.checkMainThread();
        Preconditions.checkState(this.mSafeCloseImageReaderProxy != null, "The ImageReader is not initialized.");
        return this.mSafeCloseImageReaderProxy.getCapacity();
    }

    @NonNull
    @VisibleForTesting
    public In getInputEdge() {
        In in = this.mInputEdge;
        Objects.requireNonNull(in);
        return in;
    }

    @NonNull
    @VisibleForTesting
    public SafeCloseImageReaderProxy getSafeCloseImageReaderProxy() {
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.mSafeCloseImageReaderProxy;
        Objects.requireNonNull(safeCloseImageReaderProxy);
        return safeCloseImageReaderProxy;
    }

    @MainThread
    @VisibleForTesting
    public void onImageProxyAvailable(@NonNull ImageProxy imageProxy) {
        Threads.checkMainThread();
        if (this.mCurrentRequest == null) {
            Logger.w(TAG, "Discarding ImageProxy which was inadvertently acquired: " + imageProxy);
            imageProxy.close();
            return;
        }
        if (((Integer) imageProxy.getImageInfo().getTagBundle().getTag(this.mCurrentRequest.getTagBundleKey())) != null) {
            matchAndPropagateImage(imageProxy);
        } else {
            Logger.w(TAG, "Discarding ImageProxy which was acquired for aborted request");
            imageProxy.close();
        }
    }

    @MainThread
    @VisibleForTesting
    public void onRequestAvailable(@NonNull final ProcessingRequest processingRequest) {
        Threads.checkMainThread();
        Preconditions.checkState(processingRequest.getStageIds().size() == 1, "only one capture stage is supported.");
        Preconditions.checkState(getCapacity() > 0, "Too many acquire images. Close image to be able to process next.");
        this.mCurrentRequest = processingRequest;
        Futures.addCallback(processingRequest.getCaptureFuture(), new FutureCallback<Void>() { // from class: androidx.camera.core.imagecapture.CaptureNode.2
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(@NonNull Throwable th2) {
                Threads.checkMainThread();
                if (processingRequest == CaptureNode.this.mCurrentRequest) {
                    Logger.w(CaptureNode.TAG, "request aborted, id=" + CaptureNode.this.mCurrentRequest.getRequestId());
                    if (CaptureNode.this.mNoMetadataImageReader != null) {
                        CaptureNode.this.mNoMetadataImageReader.clearProcessingRequest();
                    }
                    CaptureNode.this.mCurrentRequest = null;
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(@Nullable Void r1) {
            }
        }, CameraXExecutors.directExecutor());
    }

    @Override // androidx.camera.core.processing.Node
    @MainThread
    public void release() {
        Threads.checkMainThread();
        In in = this.mInputEdge;
        Objects.requireNonNull(in);
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.mSafeCloseImageReaderProxy;
        Objects.requireNonNull(safeCloseImageReaderProxy);
        releaseInputResources(in, safeCloseImageReaderProxy, this.mSafeCloseImageReaderForPostview);
    }

    @MainThread
    public void sendCaptureError(@NonNull TakePictureManager.CaptureError captureError) {
        Threads.checkMainThread();
        ProcessingRequest processingRequest = this.mCurrentRequest;
        if (processingRequest == null || processingRequest.getRequestId() != captureError.getRequestId()) {
            return;
        }
        this.mCurrentRequest.onCaptureFailure(captureError.getImageCaptureException());
    }

    @MainThread
    public void setOnImageCloseListener(ForwardingImageProxy.OnImageCloseListener onImageCloseListener) {
        Threads.checkMainThread();
        Preconditions.checkState(this.mSafeCloseImageReaderProxy != null, "The ImageReader is not initialized.");
        this.mSafeCloseImageReaderProxy.setOnImageCloseListener(onImageCloseListener);
    }

    @Override // androidx.camera.core.processing.Node
    @NonNull
    public ProcessingNode.In transform(@NonNull In in) {
        Consumer<ProcessingRequest> consumer;
        ImageReaderProxy imageReaderProxy;
        final int i = 2;
        final int i4 = 0;
        final int i6 = 1;
        Preconditions.checkState(this.mInputEdge == null && this.mSafeCloseImageReaderProxy == null, "CaptureNode does not support recreation yet.");
        this.mInputEdge = in;
        Size size = in.getSize();
        int inputFormat = in.getInputFormat();
        boolean zIsVirtualCamera = in.isVirtualCamera();
        CameraCaptureCallback anonymousClass1 = new AnonymousClass1();
        if (zIsVirtualCamera || in.getImageReaderProxyProvider() != null) {
            NoMetadataImageReader noMetadataImageReader = new NoMetadataImageReader(createImageReaderProxy(in.getImageReaderProxyProvider(), size.getWidth(), size.getHeight(), inputFormat));
            this.mNoMetadataImageReader = noMetadataImageReader;
            consumer = new Consumer(this) { // from class: androidx.camera.core.imagecapture.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CaptureNode f7514b;

                {
                    this.f7514b = this;
                }

                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    switch (i6) {
                        case 0:
                            this.f7514b.onRequestAvailable((ProcessingRequest) obj);
                            break;
                        case 1:
                            this.f7514b.lambda$transform$0((ProcessingRequest) obj);
                            break;
                        default:
                            this.f7514b.sendCaptureError((TakePictureManager.CaptureError) obj);
                            break;
                    }
                }
            };
            imageReaderProxy = noMetadataImageReader;
        } else {
            MetadataImageReader metadataImageReader = new MetadataImageReader(size.getWidth(), size.getHeight(), inputFormat, 4);
            anonymousClass1 = CameraCaptureCallbacks.createComboCallback(anonymousClass1, metadataImageReader.getCameraCaptureCallback());
            consumer = new Consumer(this) { // from class: androidx.camera.core.imagecapture.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CaptureNode f7514b;

                {
                    this.f7514b = this;
                }

                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    switch (i4) {
                        case 0:
                            this.f7514b.onRequestAvailable((ProcessingRequest) obj);
                            break;
                        case 1:
                            this.f7514b.lambda$transform$0((ProcessingRequest) obj);
                            break;
                        default:
                            this.f7514b.sendCaptureError((TakePictureManager.CaptureError) obj);
                            break;
                    }
                }
            };
            imageReaderProxy = metadataImageReader;
        }
        in.setCameraCaptureCallback(anonymousClass1);
        Surface surface = imageReaderProxy.getSurface();
        Objects.requireNonNull(surface);
        in.setSurface(surface);
        this.mSafeCloseImageReaderProxy = new SafeCloseImageReaderProxy(imageReaderProxy);
        imageReaderProxy.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener(this) { // from class: androidx.camera.core.imagecapture.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CaptureNode f7516b;

            {
                this.f7516b = this;
            }

            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(ImageReaderProxy imageReaderProxy2) {
                switch (i4) {
                    case 0:
                        this.f7516b.lambda$transform$1(imageReaderProxy2);
                        break;
                    default:
                        this.f7516b.lambda$transform$2(imageReaderProxy2);
                        break;
                }
            }
        }, CameraXExecutors.mainThreadExecutor());
        if (in.getPostviewSize() != null) {
            ImageReaderProxy imageReaderProxyCreateImageReaderProxy = createImageReaderProxy(in.getImageReaderProxyProvider(), in.getPostviewSize().getWidth(), in.getPostviewSize().getHeight(), in.getPostviewImageFormat());
            imageReaderProxyCreateImageReaderProxy.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener(this) { // from class: androidx.camera.core.imagecapture.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CaptureNode f7516b;

                {
                    this.f7516b = this;
                }

                @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
                public final void onImageAvailable(ImageReaderProxy imageReaderProxy2) {
                    switch (i6) {
                        case 0:
                            this.f7516b.lambda$transform$1(imageReaderProxy2);
                            break;
                        default:
                            this.f7516b.lambda$transform$2(imageReaderProxy2);
                            break;
                    }
                }
            }, CameraXExecutors.mainThreadExecutor());
            this.mSafeCloseImageReaderForPostview = new SafeCloseImageReaderProxy(imageReaderProxyCreateImageReaderProxy);
            in.setPostviewSurface(imageReaderProxyCreateImageReaderProxy.getSurface(), in.getPostviewSize(), in.getPostviewImageFormat());
        }
        in.getRequestEdge().setListener(consumer);
        in.getErrorEdge().setListener(new Consumer(this) { // from class: androidx.camera.core.imagecapture.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CaptureNode f7514b;

            {
                this.f7514b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        this.f7514b.onRequestAvailable((ProcessingRequest) obj);
                        break;
                    case 1:
                        this.f7514b.lambda$transform$0((ProcessingRequest) obj);
                        break;
                    default:
                        this.f7514b.sendCaptureError((TakePictureManager.CaptureError) obj);
                        break;
                }
            }
        });
        ProcessingNode.In inOf = ProcessingNode.In.of(in.getInputFormat(), in.getOutputFormat());
        this.mOutputEdge = inOf;
        return inOf;
    }
}
