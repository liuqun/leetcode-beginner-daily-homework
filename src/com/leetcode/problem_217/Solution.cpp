/*
 * Solution.cpp
 *
 * Author: liuqun
 */

#include "Solution.h"
#include <vector>
using std::vector;
#include <set>
using std::set;

bool Solution::containsDuplicate(vector<int>& nums) {
	bool answer;

	set<int> hset(nums.begin(), nums.end());
	answer=(nums.size() > hset.size());
	hset.clear();
	return (answer);
}

bool Solution::containsDuplicateLessEfficientAnswer(vector<int>& nums) {
	set<int> hset;
	std::pair<std::set<int>::iterator, bool> successful;
	vector<int>::iterator i;
	for(i=nums.begin(); i!=nums.end(); i++) {
		const int v=*i;
		successful = hset.insert(v);
		if (!successful.second) {
			hset.clear();
			return(true);
		}
	}
	hset.clear();
	return (false);
}

#ifdef __GNUC__
#include <ext/hash_map>
using __gnu_cxx::hash_map;

bool Solution::containsDuplicateUsingGNUHashMap(vector<int>& nums) {
	hash_map<int, char> m;

	vector<int>::iterator i;
	for(i=nums.begin(); i!=nums.end(); i++) {
		const int k=*i;
		if (m.find(k)!=m.end()) {
			m.clear();
			return(true);
		}
		m.insert(std::pair<int, char>(k, 0));
	}
	m.clear();
	return (false);
}
#endif // __GNUC__

//vim: fileencoding=utf-8 tabstop=4 shiftwidth=4