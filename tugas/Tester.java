public class Tester {
    public static void main(String[] args) {
        WalkingZombie walZ = new WalkingZombie(100,1);
        JumpingZombie jumZ = new JumpingZombie(100,2);
        Barrier bar = new Barrier(100);
        Plant pln = new Plant();
        
        System.out.println(""+ walZ.getZombieInfo());
        System.out.println(""+ jumZ.getZombieInfo());
        System.out.println(""+ bar.getBarrierInfo());
        System.out.println("-------------------------");
        
        for(int i = 0; i < 4; i++){
            pln.doDestroy(walZ);
            pln.doDestroy(jumZ);
            pln.doDestroy(bar);
        }
         
        System.out.println(""+ walZ.getZombieInfo());
        System.out.println(""+ jumZ.getZombieInfo());
        System.out.println(""+ bar.getBarrierInfo());
    }
}