public class Battle{
	public void battle1(Hero h,Enemy e){ 
		int turn =0;
		while(true){
			turn++;
			System.out.println("【ターン"+turn+"】"+h.name+"Hp:"+h.hp+",Sp:"+h.sp+"  "+e.name+"Hp:"+e.hp+",Sp:"+e.sp);
			h.attack(e);
			if(e.hp<=0){
				System.out.println(e.name+"を倒した！");
				break;
			}
			e.attack(h);
			if(h.hp<=0){
				System.out.println(h.name+"は死んでしまった……");
				break;
			}
		}
	}
}