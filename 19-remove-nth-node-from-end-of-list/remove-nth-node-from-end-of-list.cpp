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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        int c = 0;
        ListNode* temp = head;
        while (temp != NULL) {
            c++;
            temp = temp -> next;
        }
        if (c==n) {
            head = head -> next;
            return head;
        }
        int index = c - n + 1;
        temp = head;

        for (int i=0; i<index-2; i++) {
            temp = temp -> next;
        }
        temp -> next = temp -> next -> next;
        return head;
    }
};
