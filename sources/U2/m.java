package U2;

import com.google.protobuf.AbstractC1203q;
import com.google.protobuf.C1202p;
import com.google.protobuf.Q;
import com.google.protobuf.V;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends AbstractC1203q {
    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    private static final m DEFAULT_INSTANCE;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile Q PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_ = "";

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        AbstractC1203q.q(m.class, mVar);
    }

    public static void s(m mVar, int i) {
        mVar.bitField0_ |= 16;
        mVar.maxAppJavaHeapMemoryKb_ = i;
    }

    public static void t(m mVar, int i) {
        mVar.bitField0_ |= 32;
        mVar.maxEncouragedAppJavaHeapMemoryKb_ = i;
    }

    public static void u(m mVar, int i) {
        mVar.bitField0_ |= 8;
        mVar.deviceRamSizeKb_ = i;
    }

    public static m v() {
        return DEFAULT_INSTANCE;
    }

    public static l x() {
        return (l) DEFAULT_INSTANCE.j();
    }

    @Override // com.google.protobuf.AbstractC1203q
    public final Object k(int i) {
        Q c1202p;
        switch (AbstractC2217b.c(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new V(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0002", new Object[]{"bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_"});
            case 3:
                return new m();
            case 4:
                return new l(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q q9 = PARSER;
                if (q9 != null) {
                    return q9;
                }
                synchronized (m.class) {
                    try {
                        c1202p = PARSER;
                        if (c1202p == null) {
                            c1202p = new C1202p();
                            PARSER = c1202p;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return c1202p;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean w() {
        return (this.bitField0_ & 16) != 0;
    }
}
