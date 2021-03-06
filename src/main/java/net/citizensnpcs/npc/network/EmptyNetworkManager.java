package net.citizensnpcs.npc.network;

import java.io.IOException;
import java.net.Socket;
import java.security.PrivateKey;

import net.citizensnpcs.util.NMS;
import net.minecraft.server.v1_4_6.Connection;
import net.minecraft.server.v1_4_6.NetworkManager;
import net.minecraft.server.v1_4_6.Packet;

public class EmptyNetworkManager extends NetworkManager {

    public EmptyNetworkManager(Socket socket, String string, Connection conn, PrivateKey key)
            throws IOException {
        super(socket, string, conn, key);

        NMS.stopNetworkThreads(this);
    }

    @Override
    public void a() {
    }

    @Override
    public void a(Connection conn) {
    }

    @Override
    public void a(String s, Object... objects) {
    }

    @Override
    public void b() {
    }

    @Override
    public void d() {
    }

    @Override
    public int e() {
        return 0;
    }

    @Override
    public void queue(Packet packet) {
    }
}