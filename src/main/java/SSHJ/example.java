package SSHJ;

import net.schmizz.sshj.SSHClient;
import net.schmizz.sshj.common.IOUtils;
import net.schmizz.sshj.connection.channel.direct.Session;
import net.schmizz.sshj.transport.verification.PromiscuousVerifier;

public class example {
    public static void main(String[] args) throws Exception {
        String TMP = "10.8.0.2:22";
        if(args.length >= 1){
            TMP = args[0];
        }
        String ret = connect(TMP);
        System.out.println(ret);
    }

    public static String connect(String url) throws Exception {
        SSHClient ssh = new SSHClient();
        ssh.addHostKeyVerifier(new PromiscuousVerifier());
        ssh.connect("10.14.0.2");
        ssh.authPassword("w30039798", "SzKp2022_wmj.");

        Session session = ssh.startSession();
        Session.Command cmd = session.exec("cat /home/w30039798/test.txt");
        String ret = IOUtils.readFully(cmd.getInputStream()).toString();
        System.out.println(ret);
        session.close();
        ssh.close();
        return ret;
    }
}
