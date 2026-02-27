package defpackage;

import cj.C1110A;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class StackHistoryBufferEntry extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "BacktraceFrame#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final BacktraceFrame addr;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final long fp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final long tag;
    public static final y0 Companion = new y0();
    public static final ProtoAdapter<StackHistoryBufferEntry> ADAPTER = new x0(FieldEncoding.LENGTH_DELIMITED, z.a(StackHistoryBufferEntry.class), "type.googleapis.com/StackHistoryBufferEntry", Syntax.PROTO_3, null, "tombstone.proto");

    public StackHistoryBufferEntry() {
        this(null, 0L, 0L, null, 15, null);
    }

    public static /* synthetic */ StackHistoryBufferEntry copy$default(StackHistoryBufferEntry stackHistoryBufferEntry, BacktraceFrame backtraceFrame, long j, long j6, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            backtraceFrame = stackHistoryBufferEntry.addr;
        }
        if ((i & 2) != 0) {
            j = stackHistoryBufferEntry.fp;
        }
        if ((i & 4) != 0) {
            j6 = stackHistoryBufferEntry.tag;
        }
        if ((i & 8) != 0) {
            byteString = stackHistoryBufferEntry.unknownFields();
        }
        ByteString byteString2 = byteString;
        return stackHistoryBufferEntry.copy(backtraceFrame, j, j6, byteString2);
    }

    public final StackHistoryBufferEntry copy(BacktraceFrame backtraceFrame, long j, long j6, ByteString unknownFields) {
        j.g(unknownFields, "unknownFields");
        return new StackHistoryBufferEntry(backtraceFrame, j, j6, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StackHistoryBufferEntry)) {
            return false;
        }
        StackHistoryBufferEntry stackHistoryBufferEntry = (StackHistoryBufferEntry) obj;
        return j.b(unknownFields(), stackHistoryBufferEntry.unknownFields()) && j.b(this.addr, stackHistoryBufferEntry.addr) && this.fp == stackHistoryBufferEntry.fp && this.tag == stackHistoryBufferEntry.tag;
    }

    public final BacktraceFrame getAddr() {
        return this.addr;
    }

    public final long getFp() {
        return this.fp;
    }

    public final long getTag() {
        return this.tag;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        BacktraceFrame backtraceFrame = this.addr;
        int iHashCode2 = (iHashCode + (backtraceFrame != null ? backtraceFrame.hashCode() : 0)) * 37;
        long j = this.fp;
        int i4 = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 37;
        long j6 = this.tag;
        int i6 = i4 + ((int) (j6 ^ (j6 >>> 32)));
        this.hashCode = i6;
        return i6;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m33newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.addr != null) {
            arrayList.add("addr=" + this.addr);
        }
        arrayList.add("fp=" + this.fp);
        arrayList.add("tag=" + this.tag);
        return C1110A.F(arrayList, ", ", "StackHistoryBufferEntry{", "}", null, 56);
    }

    public /* synthetic */ StackHistoryBufferEntry(BacktraceFrame backtraceFrame, long j, long j6, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : backtraceFrame, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j6, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m33newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackHistoryBufferEntry(BacktraceFrame backtraceFrame, long j, long j6, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(unknownFields, "unknownFields");
        this.addr = backtraceFrame;
        this.fp = j;
        this.tag = j6;
    }
}
