package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.imagecapture.Bitmap2JpegBytes;
import androidx.camera.core.imagecapture.Image2JpegBytes;
import androidx.camera.core.imagecapture.JpegBytes2Disk;
import androidx.camera.core.imagecapture.ProcessingNode;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.processing.Edge;
import androidx.camera.core.processing.InternalImageProcessor;
import androidx.camera.core.processing.Node;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class ProcessingNode implements Node<In, Void> {
    private static final String TAG = "ProcessingNode";
    private Operation<Bitmap2JpegBytes.In, Packet<byte[]>> mBitmap2JpegBytes;
    private Operation<Packet<Bitmap>, Packet<Bitmap>> mBitmapEffect;

    @NonNull
    final Executor mBlockingExecutor;
    private final boolean mHasIncorrectJpegMetadataQuirk;
    private Operation<Packet<ImageProxy>, Bitmap> mImage2Bitmap;
    private Operation<Image2JpegBytes.In, Packet<byte[]>> mImage2JpegBytes;

    @Nullable
    final InternalImageProcessor mImageProcessor;
    private Operation<InputPacket, Packet<ImageProxy>> mInput2Packet;
    private In mInputEdge;
    private Operation<Packet<byte[]>, Packet<Bitmap>> mJpegBytes2CroppedBitmap;
    private Operation<JpegBytes2Disk.In, ImageCapture.OutputFileResults> mJpegBytes2Disk;
    private Operation<Packet<byte[]>, Packet<ImageProxy>> mJpegBytes2Image;
    private Operation<Packet<ImageProxy>, ImageProxy> mJpegImage2Result;
    private final Quirks mQuirks;

    public static abstract class In {
        public static In of(int i, int i4) {
            return new AutoValue_ProcessingNode_In(new Edge(), new Edge(), i, i4);
        }

        public abstract Edge<InputPacket> getEdge();

        public abstract int getInputFormat();

        public abstract int getOutputFormat();

        public abstract Edge<InputPacket> getPostviewEdge();
    }

    public static abstract class InputPacket {
        public static InputPacket of(@NonNull ProcessingRequest processingRequest, @NonNull ImageProxy imageProxy) {
            return new AutoValue_ProcessingNode_InputPacket(processingRequest, imageProxy);
        }

        @NonNull
        public abstract ImageProxy getImageProxy();

        @NonNull
        public abstract ProcessingRequest getProcessingRequest();
    }

    @VisibleForTesting
    public ProcessingNode(@NonNull Executor executor) {
        this(executor, null, DeviceQuirks.getAll());
    }

    private Packet<byte[]> cropAndMaybeApplyEffect(Packet<byte[]> packet, int i) throws ImageCaptureException {
        Preconditions.checkState(ImageUtil.isJpegFormats(packet.getFormat()));
        Packet<Bitmap> packetApply = this.mJpegBytes2CroppedBitmap.apply(packet);
        Operation<Packet<Bitmap>, Packet<Bitmap>> operation = this.mBitmapEffect;
        if (operation != null) {
            packetApply = operation.apply(packetApply);
        }
        return this.mBitmap2JpegBytes.apply(Bitmap2JpegBytes.In.of(packetApply, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transform$1(InputPacket inputPacket) {
        if (inputPacket.getProcessingRequest().isAborted()) {
            inputPacket.getImageProxy().close();
        } else {
            this.mBlockingExecutor.execute(new f(this, inputPacket, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transform$3(InputPacket inputPacket) {
        if (!inputPacket.getProcessingRequest().isAborted()) {
            this.mBlockingExecutor.execute(new f(this, inputPacket, 0));
        } else {
            Logger.w(TAG, "The postview image is closed due to request aborted");
            inputPacket.getImageProxy().close();
        }
    }

    private static void sendError(@NonNull ProcessingRequest processingRequest, @NonNull ImageCaptureException imageCaptureException) {
        CameraXExecutors.mainThreadExecutor().execute(new h(0, processingRequest, imageCaptureException));
    }

    @VisibleForTesting
    public void injectProcessingInput2Packet(@NonNull Operation<InputPacket, Packet<ImageProxy>> operation) {
        this.mInput2Packet = operation;
    }

    @NonNull
    @WorkerThread
    public ImageProxy processInMemoryCapture(@NonNull InputPacket inputPacket) throws ImageCaptureException {
        ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        Packet<ImageProxy> packetApply = this.mInput2Packet.apply(inputPacket);
        if ((packetApply.getFormat() == 35 || this.mBitmapEffect != null || this.mHasIncorrectJpegMetadataQuirk) && this.mInputEdge.getOutputFormat() == 256) {
            Packet<byte[]> packetApply2 = this.mImage2JpegBytes.apply(Image2JpegBytes.In.of(packetApply, processingRequest.getJpegQuality()));
            if (this.mBitmapEffect != null) {
                packetApply2 = cropAndMaybeApplyEffect(packetApply2, processingRequest.getJpegQuality());
            }
            packetApply = this.mJpegBytes2Image.apply(packetApply2);
        }
        return this.mJpegImage2Result.apply(packetApply);
    }

    @WorkerThread
    /* JADX INFO: renamed from: processInputPacket, reason: merged with bridge method [inline-methods] */
    public void lambda$transform$0(@NonNull InputPacket inputPacket) {
        ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        try {
            if (inputPacket.getProcessingRequest().isInMemoryCapture()) {
                CameraXExecutors.mainThreadExecutor().execute(new h(1, processingRequest, processInMemoryCapture(inputPacket)));
            } else {
                CameraXExecutors.mainThreadExecutor().execute(new h(2, processingRequest, processOnDiskCapture(inputPacket)));
            }
        } catch (ImageCaptureException e) {
            sendError(processingRequest, e);
        } catch (OutOfMemoryError e7) {
            sendError(processingRequest, new ImageCaptureException(0, "Processing failed due to low memory.", e7));
        } catch (RuntimeException e10) {
            sendError(processingRequest, new ImageCaptureException(0, "Processing failed.", e10));
        }
    }

    @NonNull
    @WorkerThread
    public ImageCapture.OutputFileResults processOnDiskCapture(@NonNull InputPacket inputPacket) throws ImageCaptureException {
        int outputFormat = this.mInputEdge.getOutputFormat();
        Preconditions.checkArgument(ImageUtil.isJpegFormats(outputFormat), "On-disk capture only support JPEG and JPEG/R output formats. Output format: " + outputFormat);
        ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        Packet<byte[]> packetApply = this.mImage2JpegBytes.apply(Image2JpegBytes.In.of(this.mInput2Packet.apply(inputPacket), processingRequest.getJpegQuality()));
        if (packetApply.hasCropping() || this.mBitmapEffect != null) {
            packetApply = cropAndMaybeApplyEffect(packetApply, processingRequest.getJpegQuality());
        }
        Operation<JpegBytes2Disk.In, ImageCapture.OutputFileResults> operation = this.mJpegBytes2Disk;
        ImageCapture.OutputFileOptions outputFileOptions = processingRequest.getOutputFileOptions();
        Objects.requireNonNull(outputFileOptions);
        return operation.apply(JpegBytes2Disk.In.of(packetApply, outputFileOptions));
    }

    @WorkerThread
    /* JADX INFO: renamed from: processPostviewInputPacket, reason: merged with bridge method [inline-methods] */
    public void lambda$transform$2(@NonNull InputPacket inputPacket) {
        int outputFormat = this.mInputEdge.getOutputFormat();
        Preconditions.checkArgument(outputFormat == 35 || outputFormat == 256, "Postview only support YUV and JPEG output formats. Output format: " + outputFormat);
        try {
            CameraXExecutors.mainThreadExecutor().execute(new h(3, inputPacket.getProcessingRequest(), this.mImage2Bitmap.apply(this.mInput2Packet.apply(inputPacket))));
        } catch (Exception e) {
            inputPacket.getImageProxy().close();
            Logger.e(TAG, "process postview input packet failed.", e);
        }
    }

    @Override // androidx.camera.core.processing.Node
    public void release() {
    }

    @VisibleForTesting
    public ProcessingNode(@NonNull Executor executor, @NonNull Quirks quirks) {
        this(executor, null, quirks);
    }

    @Override // androidx.camera.core.processing.Node
    @NonNull
    public Void transform(@NonNull In in) {
        this.mInputEdge = in;
        final int i = 0;
        in.getEdge().setListener(new Consumer(this) { // from class: androidx.camera.core.imagecapture.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProcessingNode f7526b;

            {
                this.f7526b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        this.f7526b.lambda$transform$1((ProcessingNode.InputPacket) obj);
                        break;
                    default:
                        this.f7526b.lambda$transform$3((ProcessingNode.InputPacket) obj);
                        break;
                }
            }
        });
        final int i4 = 1;
        in.getPostviewEdge().setListener(new Consumer(this) { // from class: androidx.camera.core.imagecapture.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProcessingNode f7526b;

            {
                this.f7526b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        this.f7526b.lambda$transform$1((ProcessingNode.InputPacket) obj);
                        break;
                    default:
                        this.f7526b.lambda$transform$3((ProcessingNode.InputPacket) obj);
                        break;
                }
            }
        });
        this.mInput2Packet = new ProcessingInput2Packet();
        this.mImage2JpegBytes = new Image2JpegBytes(this.mQuirks);
        this.mJpegBytes2CroppedBitmap = new JpegBytes2CroppedBitmap();
        this.mBitmap2JpegBytes = new Bitmap2JpegBytes();
        this.mJpegBytes2Disk = new JpegBytes2Disk();
        this.mJpegImage2Result = new JpegImage2Result();
        this.mImage2Bitmap = new Image2Bitmap();
        if (in.getInputFormat() == 35 || this.mImageProcessor != null || this.mHasIncorrectJpegMetadataQuirk) {
            this.mJpegBytes2Image = new JpegBytes2Image();
        }
        InternalImageProcessor internalImageProcessor = this.mImageProcessor;
        if (internalImageProcessor == null) {
            return null;
        }
        this.mBitmapEffect = new BitmapEffect(internalImageProcessor);
        return null;
    }

    public ProcessingNode(@NonNull Executor executor, @Nullable InternalImageProcessor internalImageProcessor) {
        this(executor, internalImageProcessor, DeviceQuirks.getAll());
    }

    public ProcessingNode(@NonNull Executor executor, @Nullable InternalImageProcessor internalImageProcessor, @NonNull Quirks quirks) {
        if (DeviceQuirks.get(LowMemoryQuirk.class) != null) {
            this.mBlockingExecutor = CameraXExecutors.newSequentialExecutor(executor);
        } else {
            this.mBlockingExecutor = executor;
        }
        this.mImageProcessor = internalImageProcessor;
        this.mQuirks = quirks;
        this.mHasIncorrectJpegMetadataQuirk = quirks.contains(IncorrectJpegMetadataQuirk.class);
    }
}
