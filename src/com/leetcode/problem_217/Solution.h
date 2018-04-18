/*
 * Solution.h
 *
 * Author: liuqun
 */

#ifndef SOLUTION_H_
#define SOLUTION_H_

#include <vector>

class Solution {
public:
	bool containsDuplicate(std::vector<int>& nums);
	bool containsDuplicateLessEfficientAnswer(std::vector<int>& nums);
#ifdef __GNUC__
	bool containsDuplicateUsingGNUHashMap(std::vector<int>& nums);
#endif
};

#endif /* SOLUTION_H_ */

// vim: fileencoding=utf-8 tabstop=4 shiftwidth=4 noexpandtab
