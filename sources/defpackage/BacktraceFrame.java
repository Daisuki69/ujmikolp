package defpackage;

import androidx.core.app.FrameMetricsAggregator;
import cj.C1110A;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes2.dex */
public final class BacktraceFrame extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = Constants.BUILD_ID, label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String build_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "fileMapOffset", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final long file_map_offset;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "fileName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String file_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "functionName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String function_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "functionOffset", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final long function_offset;

    /* JADX INFO: renamed from: pc, reason: collision with root package name */
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final long f388pc;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "relPc", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final long rel_pc;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final long sp;
    public static final C1489g Companion = new C1489g();
    public static final ProtoAdapter<BacktraceFrame> ADAPTER = new C1452f(FieldEncoding.LENGTH_DELIMITED, z.a(BacktraceFrame.class), "type.googleapis.com/BacktraceFrame", Syntax.PROTO_3, null, "tombstone.proto");

    public BacktraceFrame() {
        this(0L, 0L, 0L, null, 0L, null, 0L, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public final BacktraceFrame copy(long j, long j6, long j7, String function_name, long j9, String file_name, long j10, String build_id, ByteString unknownFields) {
        j.g(function_name, "function_name");
        j.g(file_name, "file_name");
        j.g(build_id, "build_id");
        j.g(unknownFields, "unknownFields");
        return new BacktraceFrame(j, j6, j7, function_name, j9, file_name, j10, build_id, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BacktraceFrame)) {
            return false;
        }
        BacktraceFrame backtraceFrame = (BacktraceFrame) obj;
        return j.b(unknownFields(), backtraceFrame.unknownFields()) && this.rel_pc == backtraceFrame.rel_pc && this.f388pc == backtraceFrame.f388pc && this.sp == backtraceFrame.sp && j.b(this.function_name, backtraceFrame.function_name) && this.function_offset == backtraceFrame.function_offset && j.b(this.file_name, backtraceFrame.file_name) && this.file_map_offset == backtraceFrame.file_map_offset && j.b(this.build_id, backtraceFrame.build_id);
    }

    public final String getBuild_id() {
        return this.build_id;
    }

    public final long getFile_map_offset() {
        return this.file_map_offset;
    }

    public final String getFile_name() {
        return this.file_name;
    }

    public final String getFunction_name() {
        return this.function_name;
    }

    public final long getFunction_offset() {
        return this.function_offset;
    }

    public final long getPc() {
        return this.f388pc;
    }

    public final long getRel_pc() {
        return this.rel_pc;
    }

    public final long getSp() {
        return this.sp;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        long j = this.rel_pc;
        int i4 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 37;
        long j6 = this.f388pc;
        int i6 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 37;
        long j7 = this.sp;
        int iC = AbstractC1414e.c((i6 + ((int) (j7 ^ (j7 >>> 32)))) * 37, 37, this.function_name);
        long j9 = this.function_offset;
        int iC2 = AbstractC1414e.c((iC + ((int) (j9 ^ (j9 >>> 32)))) * 37, 37, this.file_name);
        long j10 = this.file_map_offset;
        int iHashCode2 = this.build_id.hashCode() + ((iC2 + ((int) (j10 ^ (j10 >>> 32)))) * 37);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m1newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("rel_pc=" + this.rel_pc);
        arrayList.add("pc=" + this.f388pc);
        arrayList.add("sp=" + this.sp);
        arrayList.add("function_name=" + Internal.sanitize(this.function_name));
        arrayList.add("function_offset=" + this.function_offset);
        arrayList.add("file_name=" + Internal.sanitize(this.file_name));
        arrayList.add("file_map_offset=" + this.file_map_offset);
        AbstractC1414e.p(this.build_id, new StringBuilder("build_id="), arrayList);
        return C1110A.F(arrayList, ", ", "BacktraceFrame{", "}", null, 56);
    }

    public /* synthetic */ BacktraceFrame(long j, long j6, long j7, String str, long j9, String str2, long j10, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j6, (i & 4) != 0 ? 0L : j7, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? 0L : j9, (i & 32) != 0 ? "" : str2, (i & 64) == 0 ? j10 : 0L, (i & 128) == 0 ? str3 : "", (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m1newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BacktraceFrame(long j, long j6, long j7, String function_name, long j9, String file_name, long j10, String build_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(function_name, "function_name");
        j.g(file_name, "file_name");
        j.g(build_id, "build_id");
        j.g(unknownFields, "unknownFields");
        this.rel_pc = j;
        this.f388pc = j6;
        this.sp = j7;
        this.function_name = function_name;
        this.function_offset = j9;
        this.file_name = file_name;
        this.file_map_offset = j10;
        this.build_id = build_id;
    }
}
