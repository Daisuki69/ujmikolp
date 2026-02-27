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

/* JADX INFO: loaded from: classes3.dex */
public final class Bluetooth extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "BondedBluetoothDevice#ADAPTER", jsonName = "bondedDevices", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<BondedBluetoothDevice> bonded_devices;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "deviceMacAddress", schemaIndex = 1, tag = 2)
    private final String device_mac_address;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "deviceName", schemaIndex = 0, tag = 1)
    private final String device_name;
    public static final C1579i Companion = new C1579i();
    public static final ProtoAdapter<Bluetooth> ADAPTER = new C1528h(FieldEncoding.LENGTH_DELIMITED, z.a(Bluetooth.class), "type.googleapis.com/Bluetooth", Syntax.PROTO_3, null, "dde-protobuf/models/core.proto");

    public Bluetooth() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Bluetooth copy$default(Bluetooth bluetooth, String str, String str2, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bluetooth.device_name;
        }
        if ((i & 2) != 0) {
            str2 = bluetooth.device_mac_address;
        }
        if ((i & 4) != 0) {
            list = bluetooth.bonded_devices;
        }
        if ((i & 8) != 0) {
            byteString = bluetooth.unknownFields();
        }
        return bluetooth.copy(str, str2, list, byteString);
    }

    public final Bluetooth copy(String str, String str2, List<BondedBluetoothDevice> bonded_devices, ByteString unknownFields) {
        j.g(bonded_devices, "bonded_devices");
        j.g(unknownFields, "unknownFields");
        return new Bluetooth(str, str2, bonded_devices, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Bluetooth)) {
            return false;
        }
        Bluetooth bluetooth = (Bluetooth) obj;
        return j.b(unknownFields(), bluetooth.unknownFields()) && j.b(this.device_name, bluetooth.device_name) && j.b(this.device_mac_address, bluetooth.device_mac_address) && j.b(this.bonded_devices, bluetooth.bonded_devices);
    }

    public final List<BondedBluetoothDevice> getBonded_devices() {
        return this.bonded_devices;
    }

    public final String getDevice_mac_address() {
        return this.device_mac_address;
    }

    public final String getDevice_name() {
        return this.device_name;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.device_name;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.device_mac_address;
        int iHashCode3 = this.bonded_devices.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m2newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.device_name != null) {
            AbstractC1414e.p(this.device_name, new StringBuilder("device_name="), arrayList);
        }
        if (this.device_mac_address != null) {
            AbstractC1414e.p(this.device_mac_address, new StringBuilder("device_mac_address="), arrayList);
        }
        if (!this.bonded_devices.isEmpty()) {
            AbstractC1414e.s(new StringBuilder("bonded_devices="), this.bonded_devices, arrayList);
        }
        return C1110A.F(arrayList, ", ", "Bluetooth{", "}", null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bluetooth(String str, String str2, List<BondedBluetoothDevice> bonded_devices, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(bonded_devices, "bonded_devices");
        j.g(unknownFields, "unknownFields");
        this.device_name = str;
        this.device_mac_address = str2;
        this.bonded_devices = Internal.immutableCopyOf("bonded_devices", bonded_devices);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m2newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public Bluetooth(String str, String str2, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? C1112C.f9377a : list, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }
}
