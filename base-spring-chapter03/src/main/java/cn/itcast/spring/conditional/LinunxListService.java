package cn.itcast.spring.conditional;

public class LinunxListService implements ListService {

	@Override
	public String showListCmd() {
		return "ls";
	}
}
