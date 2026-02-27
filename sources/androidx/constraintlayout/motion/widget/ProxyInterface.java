package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
interface ProxyInterface {
    int designAccess(int i, String str, Object obj, float[] fArr, int i4, float[] fArr2, int i6);

    float getKeyFramePosition(Object obj, int i, float f, float f3);

    Object getKeyframeAtLocation(Object obj, float f, float f3);

    Boolean getPositionKeyframe(Object obj, Object obj2, float f, float f3, String[] strArr, float[] fArr);

    long getTransitionTimeMs();

    void setAttributes(int i, String str, Object obj, Object obj2);

    void setKeyFrame(Object obj, int i, String str, Object obj2);

    boolean setKeyFramePosition(Object obj, int i, int i4, float f, float f3);

    void setToolPosition(float f);
}
