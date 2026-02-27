package defpackage;

import cj.C1110A;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class Signal extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final int code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "codeName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String code_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "faultAddress", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final long fault_address;

    @WireField(adapter = "MemoryDump#ADAPTER", jsonName = "faultAdjacentMetadata", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final MemoryDump fault_adjacent_metadata;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasFaultAddress", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final boolean has_fault_address;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasSender", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final boolean has_sender;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final int number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "senderPid", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final int sender_pid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", jsonName = "senderUid", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final int sender_uid;
    public static final u0 Companion = new u0();
    public static final ProtoAdapter<Signal> ADAPTER = new t0(FieldEncoding.LENGTH_DELIMITED, z.a(Signal.class), "type.googleapis.com/Signal", Syntax.PROTO_3, null, "tombstone.proto");

    public Signal() {
        this(0, null, 0, null, false, 0, 0, false, 0L, null, null, 2047, null);
    }

    public static /* synthetic */ Signal copy$default(Signal signal, int i, String str, int i4, String str2, boolean z4, int i6, int i10, boolean z5, long j, MemoryDump memoryDump, ByteString byteString, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i = signal.number;
        }
        if ((i11 & 2) != 0) {
            str = signal.name;
        }
        if ((i11 & 4) != 0) {
            i4 = signal.code;
        }
        if ((i11 & 8) != 0) {
            str2 = signal.code_name;
        }
        if ((i11 & 16) != 0) {
            z4 = signal.has_sender;
        }
        if ((i11 & 32) != 0) {
            i6 = signal.sender_uid;
        }
        if ((i11 & 64) != 0) {
            i10 = signal.sender_pid;
        }
        if ((i11 & 128) != 0) {
            z5 = signal.has_fault_address;
        }
        if ((i11 & 256) != 0) {
            j = signal.fault_address;
        }
        if ((i11 & 512) != 0) {
            memoryDump = signal.fault_adjacent_metadata;
        }
        if ((i11 & 1024) != 0) {
            byteString = signal.unknownFields();
        }
        long j6 = j;
        int i12 = i10;
        boolean z8 = z5;
        boolean z9 = z4;
        int i13 = i6;
        int i14 = i4;
        String str3 = str2;
        return signal.copy(i, str, i14, str3, z9, i13, i12, z8, j6, memoryDump, byteString);
    }

    public final Signal copy(int i, String name, int i4, String code_name, boolean z4, int i6, int i10, boolean z5, long j, MemoryDump memoryDump, ByteString unknownFields) {
        j.g(name, "name");
        j.g(code_name, "code_name");
        j.g(unknownFields, "unknownFields");
        return new Signal(i, name, i4, code_name, z4, i6, i10, z5, j, memoryDump, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Signal)) {
            return false;
        }
        Signal signal = (Signal) obj;
        return j.b(unknownFields(), signal.unknownFields()) && this.number == signal.number && j.b(this.name, signal.name) && this.code == signal.code && j.b(this.code_name, signal.code_name) && this.has_sender == signal.has_sender && this.sender_uid == signal.sender_uid && this.sender_pid == signal.sender_pid && this.has_fault_address == signal.has_fault_address && this.fault_address == signal.fault_address && j.b(this.fault_adjacent_metadata, signal.fault_adjacent_metadata);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getCode_name() {
        return this.code_name;
    }

    public final long getFault_address() {
        return this.fault_address;
    }

    public final MemoryDump getFault_adjacent_metadata() {
        return this.fault_adjacent_metadata;
    }

    public final boolean getHas_fault_address() {
        return this.has_fault_address;
    }

    public final boolean getHas_sender() {
        return this.has_sender;
    }

    public final String getName() {
        return this.name;
    }

    public final int getNumber() {
        return this.number;
    }

    public final int getSender_pid() {
        return this.sender_pid;
    }

    public final int getSender_uid() {
        return this.sender_uid;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iC = (((((AbstractC1414e.c((AbstractC1414e.c(((unknownFields().hashCode() * 37) + this.number) * 37, 37, this.name) + this.code) * 37, 37, this.code_name) + (this.has_sender ? 1231 : 1237)) * 37) + this.sender_uid) * 37) + this.sender_pid) * 37;
        int i4 = this.has_fault_address ? 1231 : 1237;
        long j = this.fault_address;
        int i6 = (((iC + i4) * 37) + ((int) (j ^ (j >>> 32)))) * 37;
        MemoryDump memoryDump = this.fault_adjacent_metadata;
        int iHashCode = i6 + (memoryDump != null ? memoryDump.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m31newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("number=" + this.number);
        arrayList.add("name=" + Internal.sanitize(this.name));
        arrayList.add("code=" + this.code);
        arrayList.add("code_name=" + Internal.sanitize(this.code_name));
        arrayList.add("has_sender=" + this.has_sender);
        arrayList.add("sender_uid=" + this.sender_uid);
        arrayList.add("sender_pid=" + this.sender_pid);
        arrayList.add("has_fault_address=" + this.has_fault_address);
        arrayList.add("fault_address=" + this.fault_address);
        if (this.fault_adjacent_metadata != null) {
            arrayList.add("fault_adjacent_metadata=" + this.fault_adjacent_metadata);
        }
        return C1110A.F(arrayList, ", ", "Signal{", "}", null, 56);
    }

    public /* synthetic */ Signal(int i, String str, int i4, String str2, boolean z4, int i6, int i10, boolean z5, long j, MemoryDump memoryDump, ByteString byteString, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? 0 : i4, (i11 & 8) == 0 ? str2 : "", (i11 & 16) != 0 ? false : z4, (i11 & 32) != 0 ? 0 : i6, (i11 & 64) != 0 ? 0 : i10, (i11 & 128) == 0 ? z5 : false, (i11 & 256) != 0 ? 0L : j, (i11 & 512) != 0 ? null : memoryDump, (i11 & 1024) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m31newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Signal(int i, String name, int i4, String code_name, boolean z4, int i6, int i10, boolean z5, long j, MemoryDump memoryDump, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(name, "name");
        j.g(code_name, "code_name");
        j.g(unknownFields, "unknownFields");
        this.number = i;
        this.name = name;
        this.code = i4;
        this.code_name = code_name;
        this.has_sender = z4;
        this.sender_uid = i6;
        this.sender_pid = i10;
        this.has_fault_address = z5;
        this.fault_address = j;
        this.fault_adjacent_metadata = memoryDump;
    }
}
