package dg;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.internal.Internal;
import dOYHB6.tiZVw8.numX49;
import dde.protobuf.fragments.Bluetooth;
import dde.protobuf.fragments.BondedDevice;
import defpackage.AbstractC1414e;
import java.io.IOException;
import java.util.ArrayList;
import okio.ByteString;

/* JADX INFO: renamed from: dg.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1379c extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        ArrayList arrayListJ = AbstractC1414e.j(protoReader, numX49.tnTj78("bd5B"));
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
                arrayListJ.add(BondedDevice.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) throws IOException {
        Bluetooth bluetooth = (Bluetooth) obj;
        kotlin.jvm.internal.j.g(protoWriter, numX49.tnTj78("bd5u"));
        kotlin.jvm.internal.j.g(bluetooth, numX49.tnTj78("bd5V"));
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, bluetooth.getName());
        protoAdapter.encodeWithTag(protoWriter, 2, bluetooth.getMacAddress());
        BondedDevice.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, bluetooth.getBondedDevices());
        protoWriter.writeBytes(bluetooth.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Bluetooth bluetooth = (Bluetooth) obj;
        kotlin.jvm.internal.j.g(bluetooth, numX49.tnTj78("bd5d"));
        int size = bluetooth.unknownFields().size();
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return BondedDevice.ADAPTER.asRepeated().encodedSizeWithTag(3, bluetooth.getBondedDevices()) + protoAdapter.encodedSizeWithTag(2, bluetooth.getMacAddress()) + protoAdapter.encodedSizeWithTag(1, bluetooth.getName()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Bluetooth bluetooth = (Bluetooth) obj;
        kotlin.jvm.internal.j.g(bluetooth, numX49.tnTj78("bd5i"));
        return Bluetooth.copy$default(bluetooth, null, null, Internal.m186redactElements(bluetooth.getBondedDevices(), BondedDevice.ADAPTER), ByteString.EMPTY, 3, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws IOException {
        Bluetooth bluetooth = (Bluetooth) obj;
        kotlin.jvm.internal.j.g(reverseProtoWriter, numX49.tnTj78("bd5S"));
        kotlin.jvm.internal.j.g(bluetooth, numX49.tnTj78("bd5j"));
        reverseProtoWriter.writeBytes(bluetooth.unknownFields());
        BondedDevice.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, bluetooth.getBondedDevices());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, bluetooth.getMacAddress());
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, bluetooth.getName());
    }
}
