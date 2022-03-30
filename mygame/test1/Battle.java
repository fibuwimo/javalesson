public class Battle{
	public void battle(Hero h){
		System.out.println("-------一戦目-------");
		Enemy e1 = new Enemy();
		battle1(h,e1);
		if(!h.isAlive){
			return;
		}
		System.out.println("-------二戦目-------");
		SuperEnemy e2 = new SuperEnemy();
		battle1(h,e2);
	}
	public void battle1(Hero h,Enemy e){ 
		int turn =0;
		while(true){
			turn++;
			System.out.println("【ターン"+turn+"】"+h.name+"Hp:"+h.hp+",Sp:"+h.sp+"  "+e.name+"Hp:"+e.hp+",Sp:"+e.sp);
			h.action(e);
			if(e.hp<=0){
				System.out.println(e.name+"を倒した！");
				break;
			}
			e.action(h);
			if(h.hp<=0){
				System.out.println(h.name+"は死んでしまった……");
				h.isAlive=false;
				break;
			}
		}
	}
}
