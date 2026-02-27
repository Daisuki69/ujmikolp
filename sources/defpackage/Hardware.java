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
public final class Hardware extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "numberOfCpu", schemaIndex = 1, tag = 2)
    private final String number_of_cpu;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ramTotalSize", schemaIndex = 0, tag = 1)
    private final String ram_total_size;

    @WireField(adapter = "Volume#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<Volume> volumes;
    public static final K Companion = new K();
    public static final ProtoAdapter<Hardware> ADAPTER = new J(FieldEncoding.LENGTH_DELIMITED, z.a(Hardware.class), "type.googleapis.com/Hardware", Syntax.PROTO_3, null, "dde-protobuf/models/core.proto");

    public Hardware() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Hardware copy$default(Hardware hardware, String str, String str2, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hardware.ram_total_size;
        }
        if ((i & 2) != 0) {
            str2 = hardware.number_of_cpu;
        }
        if ((i & 4) != 0) {
            list = hardware.volumes;
        }
        if ((i & 8) != 0) {
            byteString = hardware.unknownFields();
        }
        return hardware.copy(str, str2, list, byteString);
    }

    public final Hardware copy(String str, String str2, List<Volume> volumes, ByteString unknownFields) {
        j.g(volumes, "volumes");
        j.g(unknownFields, "unknownFields");
        return new Hardware(str, str2, volumes, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Hardware)) {
            return false;
        }
        Hardware hardware = (Hardware) obj;
        return j.b(unknownFields(), hardware.unknownFields()) && j.b(this.ram_total_size, hardware.ram_total_size) && j.b(this.number_of_cpu, hardware.number_of_cpu) && j.b(this.volumes, hardware.volumes);
    }

    public final String getNumber_of_cpu() {
        return this.number_of_cpu;
    }

    public final String getRam_total_size() {
        return this.ram_total_size;
    }

    public final List<Volume> getVolumes() {
        return this.volumes;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.ram_total_size;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.number_of_cpu;
        int iHashCode3 = this.volumes.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m16newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.ram_total_size != null) {
            AbstractC1414e.p(this.ram_total_size, new StringBuilder("ram_total_size="), arrayList);
        }
        if (this.number_of_cpu != null) {
            AbstractC1414e.p(this.number_of_cpu, new StringBuilder("number_of_cpu="), arrayList);
        }
        if (!this.volumes.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("volumes="), this.volumes, arrayList);
        }
        return C1110A.F(arrayList, ", ", "Hardware{", "}", null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hardware(String str, String str2, List<Volume> volumes, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(volumes, "volumes");
        j.g(unknownFields, "unknownFields");
        this.ram_total_size = str;
        this.number_of_cpu = str2;
        this.volumes = Internal.immutableCopyOf("volumes", volumes);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m16newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public Hardware(String str, String str2, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? C1112C.f9377a : list, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }
}
