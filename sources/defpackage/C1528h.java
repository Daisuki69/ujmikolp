package defpackage;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import okio.ByteString;

/* JADX INFO: renamed from: h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1528h extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        ArrayList arrayListJ = AbstractC1414e.j(protoReader, "reader");
        long jBeginMessage = protoReader.beginMessage();
        String strDecode = null;
        String strDecode2 = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new Bluetooth(strDecode, strDecode2, arrayListJ, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                strDecode = ProtoAdapter.STRING.decode(protoReader);
            } else if (iNextTag == 2) {
                strDecode2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (iNextTag != 3) {
                protoReader.readUnknownField(iNextTag);
            } else {
                arrayListJ.add(BondedBluetoothDevice.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter writer, Object obj) throws IOException {
        Bluetooth value = (Bluetooth) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(writer, 1, value.getDevice_name());
        protoAdapter.encodeWithTag(writer, 2, value.getDevice_mac_address());
        BondedBluetoothDevice.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.getBonded_devices());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Bluetooth value = (Bluetooth) obj;
        j.g(value, "value");
        int size = value.unknownFields().size();
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return BondedBluetoothDevice.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getBonded_devices()) + protoAdapter.encodedSizeWithTag(2, value.getDevice_mac_address()) + protoAdapter.encodedSizeWithTag(1, value.getDevice_name()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Bluetooth value = (Bluetooth) obj;
        j.g(value, "value");
        return Bluetooth.copy$default(value, null, null, Internal.m186redactElements(value.getBonded_devices(), BondedBluetoothDevice.ADAPTER), ByteString.EMPTY, 3, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter writer, Object obj) throws IOException {
        Bluetooth value = (Bluetooth) obj;
        j.g(writer, "writer");
        j.g(value, "value");
        writer.writeBytes(value.unknownFields());
        BondedBluetoothDevice.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.getBonded_devices());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(writer, 2, value.getDevice_mac_address());
        protoAdapter.encodeWithTag(writer, 1, value.getDevice_name());
    }
}
