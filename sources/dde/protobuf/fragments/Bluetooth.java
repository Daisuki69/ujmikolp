package dde.protobuf.fragments;

import cj.C1110A;
import cj.C1112C;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import defpackage.AbstractC1414e;
import dg.C1379c;
import dg.C1380d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class Bluetooth extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "dde.protobuf.fragments.BondedDevice#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<BondedDevice> bondedDevices;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String macAddress;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String name;
    public static final C1380d Companion = new C1380d();
    public static final ProtoAdapter<Bluetooth> ADAPTER = new C1379c(FieldEncoding.LENGTH_DELIMITED, z.a(Bluetooth.class), "type.googleapis.com/dde.protobuf.fragments.Bluetooth", Syntax.PROTO_3, null, "dde-protobuf/fragments/Bluetooth.proto");

    public Bluetooth() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Bluetooth copy$default(Bluetooth bluetooth, String str, String str2, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bluetooth.name;
        }
        if ((i & 2) != 0) {
            str2 = bluetooth.macAddress;
        }
        if ((i & 4) != 0) {
            list = bluetooth.bondedDevices;
        }
        if ((i & 8) != 0) {
            byteString = bluetooth.unknownFields();
        }
        return bluetooth.copy(str, str2, list, byteString);
    }

    public final Bluetooth copy(String str, String str2, List<BondedDevice> bondedDevices, ByteString unknownFields) {
        j.g(bondedDevices, "bondedDevices");
        j.g(unknownFields, "unknownFields");
        return new Bluetooth(str, str2, bondedDevices, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Bluetooth)) {
            return false;
        }
        Bluetooth bluetooth = (Bluetooth) obj;
        return j.b(unknownFields(), bluetooth.unknownFields()) && j.b(this.name, bluetooth.name) && j.b(this.macAddress, bluetooth.macAddress) && j.b(this.bondedDevices, bluetooth.bondedDevices);
    }

    public final List<BondedDevice> getBondedDevices() {
        return this.bondedDevices;
    }

    public final String getMacAddress() {
        return this.macAddress;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.macAddress;
        int iHashCode3 = this.bondedDevices.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m227newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.name != null) {
            AbstractC1414e.p(this.name, new StringBuilder("name="), arrayList);
        }
        if (this.macAddress != null) {
            AbstractC1414e.p(this.macAddress, new StringBuilder("macAddress="), arrayList);
        }
        if (!this.bondedDevices.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("bondedDevices="), this.bondedDevices, arrayList);
        }
        return C1110A.F(arrayList, ", ", "Bluetooth{", "}", null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bluetooth(String str, String str2, List<BondedDevice> bondedDevices, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(bondedDevices, "bondedDevices");
        j.g(unknownFields, "unknownFields");
        this.name = str;
        this.macAddress = str2;
        this.bondedDevices = Internal.immutableCopyOf("bondedDevices", bondedDevices);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m227newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public Bluetooth(String str, String str2, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? C1112C.f9377a : list, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }
}
