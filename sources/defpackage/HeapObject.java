package defpackage;

import cj.C1110A;
import cj.C1112C;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class HeapObject extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final long address;

    @WireField(adapter = "BacktraceFrame#ADAPTER", jsonName = "allocationBacktrace", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    private final List<BacktraceFrame> allocation_backtrace;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "allocationTid", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final long allocation_tid;

    @WireField(adapter = "BacktraceFrame#ADAPTER", jsonName = "deallocationBacktrace", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 6)
    private final List<BacktraceFrame> deallocation_backtrace;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "deallocationTid", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final long deallocation_tid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final long size;
    public static final M Companion = new M();
    public static final ProtoAdapter<HeapObject> ADAPTER = new L(FieldEncoding.LENGTH_DELIMITED, z.a(HeapObject.class), "type.googleapis.com/HeapObject", Syntax.PROTO_3, null, "tombstone.proto");

    public HeapObject() {
        this(0L, 0L, 0L, null, 0L, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HeapObject copy$default(HeapObject heapObject, long j, long j6, long j7, List list, long j9, List list2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            j = heapObject.address;
        }
        return heapObject.copy(j, (i & 2) != 0 ? heapObject.size : j6, (i & 4) != 0 ? heapObject.allocation_tid : j7, (i & 8) != 0 ? heapObject.allocation_backtrace : list, (i & 16) != 0 ? heapObject.deallocation_tid : j9, (i & 32) != 0 ? heapObject.deallocation_backtrace : list2, (i & 64) != 0 ? heapObject.unknownFields() : byteString);
    }

    public final HeapObject copy(long j, long j6, long j7, List<BacktraceFrame> allocation_backtrace, long j9, List<BacktraceFrame> deallocation_backtrace, ByteString unknownFields) {
        j.g(allocation_backtrace, "allocation_backtrace");
        j.g(deallocation_backtrace, "deallocation_backtrace");
        j.g(unknownFields, "unknownFields");
        return new HeapObject(j, j6, j7, allocation_backtrace, j9, deallocation_backtrace, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeapObject)) {
            return false;
        }
        HeapObject heapObject = (HeapObject) obj;
        return j.b(unknownFields(), heapObject.unknownFields()) && this.address == heapObject.address && this.size == heapObject.size && this.allocation_tid == heapObject.allocation_tid && j.b(this.allocation_backtrace, heapObject.allocation_backtrace) && this.deallocation_tid == heapObject.deallocation_tid && j.b(this.deallocation_backtrace, heapObject.deallocation_backtrace);
    }

    public final long getAddress() {
        return this.address;
    }

    public final List<BacktraceFrame> getAllocation_backtrace() {
        return this.allocation_backtrace;
    }

    public final long getAllocation_tid() {
        return this.allocation_tid;
    }

    public final List<BacktraceFrame> getDeallocation_backtrace() {
        return this.deallocation_backtrace;
    }

    public final long getDeallocation_tid() {
        return this.deallocation_tid;
    }

    public final long getSize() {
        return this.size;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        long j = this.address;
        int i4 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 37;
        long j6 = this.size;
        int i6 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 37;
        long j7 = this.allocation_tid;
        int iD = AbstractC1414e.d(this.allocation_backtrace, (i6 + ((int) (j7 ^ (j7 >>> 32)))) * 37, 37);
        long j9 = this.deallocation_tid;
        int iHashCode2 = this.deallocation_backtrace.hashCode() + ((iD + ((int) (j9 ^ (j9 >>> 32)))) * 37);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m17newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("address=" + this.address);
        arrayList.add("size=" + this.size);
        arrayList.add("allocation_tid=" + this.allocation_tid);
        if (!this.allocation_backtrace.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("allocation_backtrace="), this.allocation_backtrace, arrayList);
        }
        arrayList.add("deallocation_tid=" + this.deallocation_tid);
        if (!this.deallocation_backtrace.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("deallocation_backtrace="), this.deallocation_backtrace, arrayList);
        }
        return C1110A.F(arrayList, ", ", "HeapObject{", "}", null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeapObject(long j, long j6, long j7, List<BacktraceFrame> allocation_backtrace, long j9, List<BacktraceFrame> deallocation_backtrace, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(allocation_backtrace, "allocation_backtrace");
        j.g(deallocation_backtrace, "deallocation_backtrace");
        j.g(unknownFields, "unknownFields");
        this.address = j;
        this.size = j6;
        this.allocation_tid = j7;
        this.deallocation_tid = j9;
        this.allocation_backtrace = Internal.immutableCopyOf("allocation_backtrace", allocation_backtrace);
        this.deallocation_backtrace = Internal.immutableCopyOf("deallocation_backtrace", deallocation_backtrace);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m17newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public HeapObject(long j, long j6, long j7, List list, long j9, List list2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j6, (i & 4) != 0 ? 0L : j7, (i & 8) != 0 ? C1112C.f9377a : list, (i & 16) != 0 ? 0L : j9, (i & 32) != 0 ? C1112C.f9377a : list2, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }
}
