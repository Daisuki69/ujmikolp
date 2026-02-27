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
public final class StackHistoryBuffer extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "StackHistoryBufferEntry#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<StackHistoryBufferEntry> entries;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final long tid;
    public static final w0 Companion = new w0();
    public static final ProtoAdapter<StackHistoryBuffer> ADAPTER = new v0(FieldEncoding.LENGTH_DELIMITED, z.a(StackHistoryBuffer.class), "type.googleapis.com/StackHistoryBuffer", Syntax.PROTO_3, null, "tombstone.proto");

    public StackHistoryBuffer() {
        this(0L, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StackHistoryBuffer copy$default(StackHistoryBuffer stackHistoryBuffer, long j, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            j = stackHistoryBuffer.tid;
        }
        if ((i & 2) != 0) {
            list = stackHistoryBuffer.entries;
        }
        if ((i & 4) != 0) {
            byteString = stackHistoryBuffer.unknownFields();
        }
        return stackHistoryBuffer.copy(j, list, byteString);
    }

    public final StackHistoryBuffer copy(long j, List<StackHistoryBufferEntry> entries, ByteString unknownFields) {
        j.g(entries, "entries");
        j.g(unknownFields, "unknownFields");
        return new StackHistoryBuffer(j, entries, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StackHistoryBuffer)) {
            return false;
        }
        StackHistoryBuffer stackHistoryBuffer = (StackHistoryBuffer) obj;
        return j.b(unknownFields(), stackHistoryBuffer.unknownFields()) && this.tid == stackHistoryBuffer.tid && j.b(this.entries, stackHistoryBuffer.entries);
    }

    public final List<StackHistoryBufferEntry> getEntries() {
        return this.entries;
    }

    public final long getTid() {
        return this.tid;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        long j = this.tid;
        int iHashCode2 = this.entries.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 37);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m32newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("tid=" + this.tid);
        if (!this.entries.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("entries="), this.entries, arrayList);
        }
        return C1110A.F(arrayList, ", ", "StackHistoryBuffer{", "}", null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackHistoryBuffer(long j, List<StackHistoryBufferEntry> entries, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(entries, "entries");
        j.g(unknownFields, "unknownFields");
        this.tid = j;
        this.entries = Internal.immutableCopyOf("entries", entries);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m32newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public StackHistoryBuffer(long j, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? C1112C.f9377a : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }
}
