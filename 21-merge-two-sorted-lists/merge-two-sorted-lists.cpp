/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        // ListNode *temp = list1;
        // while (temp -> next != NULL) {
        //     temp = temp -> next;
        // }
        // temp -> next = list2;

        if (list1== NULL || list2 == NULL) {
            if (list1==NULL) {
                return list2;
            }
            return list1;
        }

        ListNode* temp = list1;
        while (temp -> next != NULL) {
            temp = temp -> next;
        }
        temp -> next = list2;
        list2 = NULL;
    
        ListNode *temp1 = list1;
        int number;
        while (temp1 != NULL) {
            ListNode *temp2 = temp1 -> next;
            while (temp2 != NULL) {
                if (temp1 -> val > temp2 -> val) {
                    number = temp1-> val;
                    temp1 -> val = temp2 -> val;
                    temp2 -> val = number;
                }
                temp2 = temp2 -> next;
            }
            temp1 = temp1 -> next;
        }
        return list1;
    }
};