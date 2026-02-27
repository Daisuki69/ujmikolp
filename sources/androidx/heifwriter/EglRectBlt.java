package androidx.heifwriter;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes.dex */
public class EglRectBlt {
    private static final FloatBuffer FULL_RECTANGLE_BUF;
    private static final float[] FULL_RECTANGLE_COORDS;
    private static final int SIZEOF_FLOAT = 4;
    private Texture2dProgram mProgram;
    private final FloatBuffer mTexCoordArray;
    private final float[] mTexCoords;
    private final int mTexHeight;
    private final int mTexWidth;

    static {
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        FULL_RECTANGLE_COORDS = fArr;
        FULL_RECTANGLE_BUF = createFloatBuffer(fArr);
    }

    public EglRectBlt(Texture2dProgram texture2dProgram, int i, int i4) {
        float[] fArr = new float[8];
        this.mTexCoords = fArr;
        this.mTexCoordArray = createFloatBuffer(fArr);
        this.mProgram = texture2dProgram;
        this.mTexWidth = i;
        this.mTexHeight = i4;
    }

    public static FloatBuffer createFloatBuffer(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    public void copyRect(int i, float[] fArr, Rect rect) {
        setTexRect(rect);
        this.mProgram.draw(Texture2dProgram.IDENTITY_MATRIX, FULL_RECTANGLE_BUF, 0, 4, 2, 8, fArr, this.mTexCoordArray, i, 8);
    }

    public int createTextureObject() {
        return this.mProgram.createTextureObject();
    }

    public void loadTexture(int i, Bitmap bitmap) {
        this.mProgram.loadTexture(i, bitmap);
    }

    public void release(boolean z4) {
        Texture2dProgram texture2dProgram = this.mProgram;
        if (texture2dProgram != null) {
            if (z4) {
                texture2dProgram.release();
            }
            this.mProgram = null;
        }
    }

    public void setTexRect(Rect rect) {
        float[] fArr = this.mTexCoords;
        int i = rect.left;
        int i4 = this.mTexWidth;
        fArr[0] = i / i4;
        int i6 = rect.bottom;
        int i10 = this.mTexHeight;
        fArr[1] = 1.0f - (i6 / i10);
        int i11 = rect.right;
        fArr[2] = i11 / i4;
        fArr[3] = 1.0f - (i6 / i10);
        fArr[4] = i / i4;
        int i12 = rect.top;
        fArr[5] = 1.0f - (i12 / i10);
        fArr[6] = i11 / i4;
        fArr[7] = 1.0f - (i12 / i10);
        this.mTexCoordArray.put(fArr);
        this.mTexCoordArray.position(0);
    }
}
